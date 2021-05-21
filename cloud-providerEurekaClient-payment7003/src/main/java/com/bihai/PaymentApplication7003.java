package com.bihai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @ClassName: ApplicationMain8001
 * @author: bihai-ui
 * @create: 2021-04-22 22:52
 * @Description: TODO
 */

@EnableEurekaClient
@SpringBootApplication
public class PaymentApplication7003 {

    public static void main(String[] args) {
        SpringApplication.run(PaymentApplication7003.class,args);
    }
}