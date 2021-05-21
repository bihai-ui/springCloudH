package com.bihai.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @author bihai
 * @create 2021-05-15 20:53
 */
@RestController
public class ProvidePaymentController {

    @Value("${spring.application.name}")
    public String serverName;


    @RequestMapping("payment/consul")
    public String getMessage(){
        return serverName + ": " + UUID.randomUUID().toString();
    }
}
