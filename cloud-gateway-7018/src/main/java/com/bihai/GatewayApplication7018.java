package com.bihai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author bihai
 * @create 2021-05-19 21:41
 */
@SpringBootApplication
@EnableEurekaClient
public class GatewayApplication7018 {

    public static void main(String[] args) {
        SpringApplication.run(GatewayApplication7018.class,args);
    }
}
