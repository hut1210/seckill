package com.momo.seckill.service;

/**
 * @Author: Hut
 * @Date: 2020/03/21 1:11
 */
public interface StockService {
    void decrByStock(String stockName);
    Integer selectByExample(String stockName);
}
