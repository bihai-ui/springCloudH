package com.bihai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author bihai
 * @create 2021-05-15 20:49
 */

@SpringBootApplication
@EnableDiscoveryClient
public class PaymentApplication7008 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentApplication7008.class,args);
    }
}
