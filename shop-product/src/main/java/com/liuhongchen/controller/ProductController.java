package com.liuhongchen.controller;

import com.liuhongchen.service.ProductService;
import entity.Product;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassName:ProductController
 * Package:com.liuhongchen.controller
 * Description:
 *
 * @date: 2021-04-02 10:21
 * @author:Hansing liuhongchengege123@gmail.com
 */
@RestController
@Slf4j
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/product/{pid}")
    public Product product(@PathVariable("pid") Integer pid) {
        return productService.findByPid(pid);
    }
}