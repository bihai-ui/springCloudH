package com.bihai.controller;

import com.bihai.service.PaymentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author bihai
 * @create 2021-05-19 14:36
 */
@RestController
public class PaymentController {

    @Resource
    private PaymentService paymentService;

    @GetMapping(value = "payment/hystrix/ok/{id}")
    public String getPaymentInfo(@PathVariable("id") int id){
       return paymentService.paymentInfo_OK(id);
    }

    @GetMapping(value = "payment/hystrix/circuitbreaker/{id}")
    public String getPaymentInfoTimeOut(@PathVariable("id") int id){
        return paymentService.paymentCircuitBreaker(id);
    }

}
