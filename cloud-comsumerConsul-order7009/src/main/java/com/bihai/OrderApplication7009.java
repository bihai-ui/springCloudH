package com.bihai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author bihai
 * @create 2021-05-15 21:14
 */
@SpringBootApplication
@EnableDiscoveryClient
public class OrderApplication7009 {
    public static void main(String[] args) {
        SpringApplication.run(OrderApplication7009.class,args);
    }
}
