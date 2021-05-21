package com.bihai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


/**
 * @ClassName: ApplicationMain8001
 * @author: bihai-ui
 * @create: 2021-04-22 22:52
 * @Description: TODO
 */

@SpringBootApplication
@EnableDiscoveryClient
public class PaymentApplication7006 {

    public static void main(String[] args) {
        SpringApplication.run(PaymentApplication7006.class,args);
    }
}