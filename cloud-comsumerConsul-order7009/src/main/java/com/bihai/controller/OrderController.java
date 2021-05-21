package com.bihai.controller;

import com.bihai.entities.CommonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author bihai
 * @create 2021-05-15 21:15
 */
@RestController
public class OrderController {

    @Autowired
    private RestTemplate restTemplate;

    private static final String PAYMENT_URL = "http://provide-consul-payment-7008";

    @RequestMapping("comsumer/payment/consul")
    public String getMessage(){
        return restTemplate.getForObject(PAYMENT_URL + "/payment/consul",String.class);
    }



}
