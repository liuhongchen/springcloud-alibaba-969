package com.liuhongchen.service.fallback;

import com.liuhongchen.service.ProductService;
import entity.Product;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class ProductServiceFallBack implements ProductService {
    @Override
    public Product findByPid(Integer pid) {
        Product product=new Product();
        product.setPid(-1);
        return product;
    }
}
