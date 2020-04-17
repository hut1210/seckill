package com.momo.seckill.mapper;

import com.momo.seckill.pojo.Order;
import com.momo.seckill.service.GenericMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author: Hut
 * @Date: 2020/03/21 0:49
 */
@Mapper
public interface OrderMapper extends GenericMapper<Order> {
    void insertOrder(Order order);
}
