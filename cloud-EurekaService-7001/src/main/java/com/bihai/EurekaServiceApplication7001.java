package com.bihai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @ClassName: EurekaServiceApplication7001
 * @author: bihai-ui
 * @create: 2021-04-24 14:57
 * @Description: TODO
 */

@EnableEurekaServer
@SpringBootApplication
public class EurekaServiceApplication7001 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServiceApplication7001.class,args);
    }
}