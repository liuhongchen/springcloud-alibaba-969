package com.liuhongchen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

/**
 * ClassName:com.liuhongchen.UserAppliacation
 * Package:PACKAGE_NAME
 * Description:
 *
 * @date: 2021-04-02 10:07
 * @author:Hansing liuhongchengege123@gmail.com
 */
@SpringBootApplication
//@EnableDiscoveryClient
@EntityScan("entity")

public class UserApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserApplication.class,args);
    }
}
