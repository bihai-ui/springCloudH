package com.bihai.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author bihai
 * @create 2021-05-16 16:38
 */
@Configuration
public class FeignConfig {

    @Bean
    public Logger.Level getLogger(){
        return Logger.Level.HEADERS;
    }

}
