package com.bihai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * @ClassName: SpringBootOrderApplication80
 * @author: bihai-ui
 * @create: 2021-04-23 23:20
 * @Description: TODO
 */

@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
public class SpringBootOrderApplication80 {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootOrderApplication80.class,args);
    }

}