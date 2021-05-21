package com.bihai.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * @author bihai
 * @create 2021-05-16 15:30
 */
public interface LoadBalance {

    ServiceInstance getInstance(List<ServiceInstance> list);
}
