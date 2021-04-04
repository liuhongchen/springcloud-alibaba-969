package com.liuhongchen.service.impl;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.liuhongchen.exception.handler.OrderServiceHandler;
import com.liuhongchen.service.OrderService2;
import org.springframework.stereotype.Service;

@Service
public class OrderService2Impl implements OrderService2 {

    @SentinelResource(
            value = "message",
            blockHandlerClass = com.liuhongchen.exception.block_handler.OrderServiceHandler.class,
            blockHandler = "blockHandler",
            fallbackClass = OrderServiceHandler.class,
            fallback = "messageHandler"
    )
    public String message() {
        return "message";
    }
}
