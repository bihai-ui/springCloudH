package com.bihai.lb;

import org.springframework.cloud.client.ServiceInstance;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author bihai
 * @create 2021-05-16 15:30
 */
@Component
public class LoadBalanceImpl implements LoadBalance{

    private AtomicInteger atomicInteger = new AtomicInteger(0);


    private int getCompareAndSet(){
        int cur;
        int next;
        do{
            cur = atomicInteger.get();
            next = cur > Integer.MAX_VALUE - 1 ? 0 : cur + 1;
        }
        while (!atomicInteger.compareAndSet(cur,next));
        System.out.println("第"+atomicInteger.get()+"次调用");
        return atomicInteger.get();
    }

    @Override
    public  ServiceInstance getInstance(List<ServiceInstance> list) {
        int index = getCompareAndSet() % list.size();
        return list.get(index);
    }
}
