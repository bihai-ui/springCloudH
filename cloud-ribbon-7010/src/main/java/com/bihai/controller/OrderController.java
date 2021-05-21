package com.bihai.controller;

import com.bihai.entities.CommonResult;
import com.bihai.entities.Payment;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @ClassName: OrderController
 * @author: bihai-ui
 * @create: 2021-04-24 0:11
 * @Description: TODO
 */

@RestController
public class OrderController {

    @Resource
    private RestTemplate restTemplate;

    private static final String PAYMET_URLPRE = "http://PROVIDEREUREKACLIENT-PAYMENT";

    @PostMapping("/order/payment")
    public CommonResult<Payment> create(@RequestBody Payment payment){
        CommonResult commonResult = restTemplate.postForObject(PAYMET_URLPRE+"/payment", Payment.class, CommonResult.class);
        return commonResult;
    }

    @GetMapping("/order/payment/{id}")
    public CommonResult<Payment> get(@PathVariable("id") Long id){
        CommonResult commonResult = restTemplate.getForObject(PAYMET_URLPRE + "/payment/"+id, CommonResult.class);
        return commonResult;
    }

    @GetMapping("/order/payment/msg")
    public String callServiceMsg(){
        String s = restTemplate.getForObject(PAYMET_URLPRE+"/payment/port", String.class);
        return s;
    }

}