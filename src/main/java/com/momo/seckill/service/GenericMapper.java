package com.momo.seckill.service;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * @Author: Hut
 * @Date: 2020/03/21 0:46
 */
public interface GenericMapper<T> extends Mapper<T>, MySqlMapper<T> {
}
