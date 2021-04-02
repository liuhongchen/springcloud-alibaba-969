package com.liuhongchen.service.impl;

import com.liuhongchen.dao.ProductDao;
import com.liuhongchen.service.ProductService;
import entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * ClassName:ProductServiceImpl
 * Package:com.liuhongchen.service.impl
 * Description:
 *
 * @date: 2021-04-02 10:20
 * @author:Hansing liuhongchengege123@gmail.com
 */
@Service
public class ProductServiceImpl implements ProductService {


    @Autowired
    private ProductDao productDao;

    @Override
    public Product findByPid(Integer pid) {
        return productDao.findById(pid).get();
    }
}
