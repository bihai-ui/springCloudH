package com.bihai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @author bihai
 * @create 2021-05-19 16:58
 */
@SpringBootApplication
@EnableHystrixDashboard
public class HystrixDashboardApplication7016 {
    public static void main(String[] args) {
        SpringApplication.run(HystrixDashboardApplication7016.class,args);
    }
}
