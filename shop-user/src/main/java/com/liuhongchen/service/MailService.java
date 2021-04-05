package com.liuhongchen.service;

import com.alibaba.fastjson.JSON;
import entity.Order;
import lombok.extern.slf4j.Slf4j;
import org.apache.rocketmq.spring.annotation.RocketMQMessageListener;
import org.apache.rocketmq.spring.core.RocketMQListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RocketMQMessageListener(consumerGroup = "shop-user",topic = "order-topic")
public class MailService implements RocketMQListener<Order> {

    @Override
    public void onMessage(Order order) {
        log.info("收到一个订单信息{}，接下来发送邮件", JSON.toJSONString(order));
    }
}
