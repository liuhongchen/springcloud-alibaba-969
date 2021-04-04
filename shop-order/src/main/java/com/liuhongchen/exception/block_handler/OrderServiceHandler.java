package com.liuhongchen.exception.block_handler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class OrderServiceHandler {

    public static String blockHander(BlockException ex){
        log.error("{}",ex);
        return "接口被限流或者降级了";
    }
}
