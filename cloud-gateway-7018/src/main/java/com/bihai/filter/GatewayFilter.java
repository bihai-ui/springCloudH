package com.bihai.filter;

import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

/**
 * @author bihai
 * @create 2021-05-19 22:08
 */
@Component
@Log4j
public class GatewayFilter implements GlobalFilter, Ordered {

    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        System.out.println("=========全局过滤器==========");
        String uname = exchange.getRequest().getQueryParams().getFirst("uname");
        if(uname == null || "".equals("")){
            System.out.println("===非法用户=====");
            exchange.getResponse().setStatusCode(HttpStatus.NOT_ACCEPTABLE);
            return exchange.getResponse().setComplete();
        }

        //filter传递
        return chain.filter(exchange);
    }


    //数字越小优先级越高
    @Override
    public int getOrder() {
        return 0;
    }
}
