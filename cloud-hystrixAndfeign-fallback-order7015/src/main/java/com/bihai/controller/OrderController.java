package com.bihai.controller;

import com.bihai.providepayment.PaymentController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

    @GetMapping("/order/payment/msg/{id}")
    public String getMessage(@PathVariable("id") int id){
        return paymentController.getPaymentInfo(id);
    }


    //客户端的服务降级
    @GetMapping("/order/payment/msgTimeout/{id}")
    public String getMessageTimeOut(@PathVariable("id") int id){
        return paymentController.getPaymentInfoTimeOut(id);
    }

}
