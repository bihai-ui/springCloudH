package com.bihai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @ClassName: EurekaServiceApplication7002
 * @author: bihai-ui
 * @create: 2021-04-24 20:16
 * @Description: TODO
 */


@EnableEurekaServer
@SpringBootApplication
public class EurekaServiceApplication7002 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServiceApplication7002.class,args);
    }
}