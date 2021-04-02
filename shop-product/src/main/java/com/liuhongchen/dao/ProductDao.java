package com.liuhongchen.dao;

import entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * ClassName:ProductDao
 * Package:com.liuhongchen.dao
 * Description:
 *
 * @date: 2021-04-02 10:18
 * @author:Hansing liuhongchengege123@gmail.com
 */
public interface ProductDao extends JpaRepository<Product,Integer> {

}
