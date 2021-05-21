package com.bihai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author bihai
 * @create 2021-05-16 15:13
 */
@SpringBootApplication
@EnableEurekaClient
public class RibbonApplication7011 {
    public static void main(String[] args) {
        SpringApplication.run(RibbonApplication7011.class,args);
    }
}
