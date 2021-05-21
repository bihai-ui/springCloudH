package com.bihai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author bihai
 * @create 2021-05-16 16:02
 */


@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class OpenFeginApplication7012 {
    public static void main(String[] args) {
        SpringApplication.run(OpenFeginApplication7012.class,args);
    }
}
