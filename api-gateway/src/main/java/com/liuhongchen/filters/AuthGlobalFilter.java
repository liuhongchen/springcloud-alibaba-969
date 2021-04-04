package com.liuhongchen.filters;

import org.apache.commons.lang.StringUtils;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

@Component
public class AuthGlobalFilter implements GlobalFilter, Ordered {
    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        String token=exchange.getRequest().getQueryParams().getFirst("token");

        //token验证失败，这里就认为有token就成功
//        if (StringUtils.isBlank(token)){
//            System.out.println("鉴权失败");
//            exchange.getResponse().setStatusCode(HttpStatus.UNAUTHORIZED);
//            return exchange.getResponse().setComplete();
//        }

        return chain.filter(exchange);
    }

    //顺序，数值越小，优先级越高
    @Override
    public int getOrder() {
        return 0;
    }
}
