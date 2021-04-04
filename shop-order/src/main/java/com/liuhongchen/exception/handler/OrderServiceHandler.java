package com.liuhongchen.exception.handler;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class OrderServiceHandler {

    public static String messageHandler(Throwable throwable) {
        log.error("{}", throwable);
        return "接口发生异常了...";
    }
}
