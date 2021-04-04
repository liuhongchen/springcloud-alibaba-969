package com.liuhongchen.filters.local;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.cloud.gateway.filter.GatewayFilter;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.factory.AbstractGatewayFilterFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

import java.util.Arrays;
import java.util.List;

@Component
public class LogGatewayFilterFactory extends AbstractGatewayFilterFactory<LogGatewayFilterFactory.Config> {


    public LogGatewayFilterFactory() {
        super(LogGatewayFilterFactory.Config.class);
    }

    public List<String> shortcutFieldOrder() {
        return Arrays.asList("consoleLog", "cacheLog");
    }

    public GatewayFilter apply(LogGatewayFilterFactory.Config config) {
        return new GatewayFilter() {
            @Override
            public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
                if (config.isCacheLog()){
                    System.out.println("cache log");
                }
                if (config.isConsoleLog()){
                    System.out.println("console log");
                }
                return chain.filter(exchange);
            }
        };
    }

    @Data
    @NoArgsConstructor
    public static class Config {
        boolean consoleLog;
        boolean cacheLog;
    }
}
