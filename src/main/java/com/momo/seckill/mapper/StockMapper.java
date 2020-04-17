package com.momo.seckill.mapper;

import com.momo.seckill.pojo.Stock;
import com.momo.seckill.service.GenericMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author: Hut
 * @Date: 2020/03/21 0:48
 */
@Mapper
public interface StockMapper extends GenericMapper<Stock> {
}
