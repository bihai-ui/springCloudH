package com.bihai.controller;

import com.bihai.moduleCalls.providepayment.PaymentController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author bihai
 * @create 2021-05-16 16:07
 */
@RestController
public class OrderController {

    @Resource
    private PaymentController paymentController;

    @GetMapping("/order/payment/msg")
    public String getMessage(){
        return paymentController.getServicePort();
    }

    @GetMapping("/order/payment/msgTimeout")
    public String getMessageTimeOut(){
        return paymentController.getServicePortTimeOut();
    }

}
