package com.liuhongchen.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.liuhongchen.service.OrderService;
import com.liuhongchen.service.OrderService2;
import com.liuhongchen.service.ProductService;
import entity.Order;
import entity.Product;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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
public class OrderController2 {

    @Autowired
    private OrderService2 orderService;



    //准备买1件商品
    @GetMapping("/message1")
    public ResponseEntity message1() {
        return ResponseEntity.ok(orderService.message());
    }

    @GetMapping("/message2")
    public ResponseEntity message2() {
        return ResponseEntity.ok(orderService.message());
    }

    @GetMapping("/message3")
    @SentinelResource("message3")
    public String message3(String name,Integer age) {

//        orderService.message();

        return name+age;
    }
}
