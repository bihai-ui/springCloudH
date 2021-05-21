package com.rule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author bihai
 * @create 2021-05-16 14:54
 */
@Configuration
public class RuleConfig {

    @Bean
    public IRule getRule(){
        return new RandomRule();
    }

}
