package com.momo.seckill.service.impl;

import com.momo.seckill.mapper.OrderMapper;
import com.momo.seckill.pojo.Order;
import com.momo.seckill.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: Hut
 * @Date: 2020/03/21 1:37
 */
@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderMapper orderMapper;
    @Override
    public void createOrder(Order order) {
        orderMapper.insert(order);
    }

}
