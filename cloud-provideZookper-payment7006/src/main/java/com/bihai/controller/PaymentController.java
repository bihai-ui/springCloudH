package com.bihai.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

/**
 * @ClassName: PaymentController
 * @author: bihai-ui
 * @create: 2021-04-22 23:54
 * @Description: TODO
 */

@RestController
public class PaymentController {


    @Value("${server.port}")
    private String port;


    @GetMapping("/payment/port")
    public  String getServicePort(){
        return "payment:"+port;
    }

}