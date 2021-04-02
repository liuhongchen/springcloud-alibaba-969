package com.liuhongchen.service.impl;

import com.liuhongchen.dao.OrderDao;
import com.liuhongchen.service.OrderService;
import entity.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * ClassName:OrderServiceImpl
 * Package:com.liuhongchen.service.impl
 * Description:
 *
 * @date: 2021-04-02 10:40
 * @author:Hansing liuhongchengege123@gmail.com
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderDao orderDao;


    @Override
    public void save(Order order) {
        orderDao.save(order);
    }
}
