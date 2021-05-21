package com.biahi.controller;

import com.biahi.providepayment.PaymentController;
import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author bihai
 * @create 2021-05-16 16:07
 */
@RestController

//全局服务降级
@DefaultProperties(defaultFallback = "defaultFallback", commandProperties = {
        @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds",value = "3000")
})
public class OrderController {

    @Resource
    private PaymentController paymentController;

    @GetMapping("/order/payment/msg/{id}")
    public String getMessage(@PathVariable("id") int id){
        return paymentController.getPaymentInfo(id);
    }


    //客户端的服务降级
    @GetMapping("/order/payment/msgTimeout/{id}")
    @HystrixCommand(fallbackMethod = "fallback", commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds",value = "3000")
    })
    public String getMessageTimeOut(@PathVariable("id") int id){
        return paymentController.getPaymentInfoTimeOut(id);
    }


    private String fallback(int id){
        return "客户端服务降级, 当前线程: " + Thread.currentThread().getName();
    }


    private String defaultFallback(int id){
        return "我是全局的服务降级，当前线程: " + Thread.currentThread().getName();
    }



}
