package com.bihai;

import com.rule.RuleConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @author bihai
 * @create 2021-05-16 13:56
 */

@SpringBootApplication
@EnableEurekaClient
@RibbonClient(value = "PROVIDEREUREKACLIENT-PAYMENT",configuration = {RuleConfig.class})
public class RibbonApplication7010 {

    public static void main(String[] args) {
        SpringApplication.run(RibbonApplication7010.class,args);
    }
}
