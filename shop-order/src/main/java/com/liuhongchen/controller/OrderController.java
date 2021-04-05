package com.liuhongchen.controller;

import com.alibaba.fastjson.JSON;
import com.liuhongchen.service.OrderService;
import com.liuhongchen.service.ProductService;
import entity.Order;
import entity.Product;
import lombok.extern.slf4j.Slf4j;
import org.apache.rocketmq.spring.core.RocketMQTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * ClassName:OrderController
 * Package:com.liuhongchen.controller
 * Description:
 *
 * @date: 2021-04-02 10:42
 * @author:Hansing liuhongchengege123@gmail.com
 */

@RestController
@Slf4j
public class OrderController {

    @Autowired
    private OrderService orderService;

    @Autowired
    private ProductService productService;

    @Autowired
    private RocketMQTemplate rocketMQTemplate;

    //准备买1件商品
    @GetMapping("/order/prod/{pid}")
    public Order order(@PathVariable("pid") Integer pid) {
        log.info(">>客户下单，这时候要调用商品微服务查询商品信息");

        Product product=productService.findByPid(pid);

        Order order = new Order();

        if (product.getPid()==-1){
            order.setPname("下单失败");
            return order;
        }

        order.setUid(1);
        order.setUsername("测试用户");
        order.setPid(product.getPid());
        order.setPname(product.getPname());
        order.setPprice(product.getPprice());
        order.setNumber(1);

        orderService.save(order);

        rocketMQTemplate.convertAndSend("order-topic",order);

        return order;
    }
}
