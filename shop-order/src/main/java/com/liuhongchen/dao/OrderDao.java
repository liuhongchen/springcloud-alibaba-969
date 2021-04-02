package com.liuhongchen.dao;

import entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * ClassName:OrderDao
 * Package:com.liuhongchen.dao
 * Description:
 *
 * @date: 2021-04-02 10:32
 * @author:Hansing liuhongchengege123@gmail.com
 */
public interface OrderDao extends JpaRepository<Order,Long> {

}
