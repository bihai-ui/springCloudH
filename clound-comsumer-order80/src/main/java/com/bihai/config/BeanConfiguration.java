package com.bihai.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName: BeanConfiguration
 * @author: bihai-ui
 * @create: 2021-04-24 0:16
 * @Description: TODO
 */

@Configuration
public class BeanConfiguration {

    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}