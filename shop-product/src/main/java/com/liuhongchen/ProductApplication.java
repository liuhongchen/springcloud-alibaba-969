package com.liuhongchen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

/**
 * ClassName:ProductApplication
 * Package:com.liuhongchen
 * Description:
 *
 * @date: 2021-04-02 10:17
 * @author:Hansing liuhongchengege123@gmail.com
 */
@SpringBootApplication
@EntityScan("entity")
public class ProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProductApplication.class,args);
    }
}
