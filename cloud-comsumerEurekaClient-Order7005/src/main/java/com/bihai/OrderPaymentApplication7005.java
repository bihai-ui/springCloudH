package com.bihai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @ClassName: SpringBootOrderApplication80
 * @author: bihai-ui
 * @create: 2021-04-23 23:20
 * @Description: TODO
 */

@EnableEurekaClient
@SpringBootApplication
public class OrderPaymentApplication7005 {

    public static void main(String[] args) {
        SpringApplication.run(OrderPaymentApplication7005.class,args);
    }

}