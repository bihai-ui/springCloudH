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

    private static final String PAYMET_URLPRE = "http://127.0.0.1:8001/payment";

    @PostMapping("/order/payment")
    public CommonResult<Payment> create(@RequestBody Payment payment){
        CommonResult commonResult = restTemplate.postForObject(PAYMET_URLPRE, Payment.class, CommonResult.class);
        return commonResult;
    }

    @GetMapping("/order/payment/{id}")
    public CommonResult<Payment> get(@PathVariable("id") Long id){
        CommonResult commonResult = restTemplate.getForObject(PAYMET_URLPRE + "/"+id, CommonResult.class);
        return commonResult;
    }

}