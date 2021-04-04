package com.liuhongchen.service;


import com.liuhongchen.service.fallback.ProductServiceFallBack;
import entity.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "service-product",fallback = ProductServiceFallBack.class)
public interface ProductService {


    @GetMapping("/product/{pid}")
    Product findByPid(@PathVariable("pid") Integer pid);
}
