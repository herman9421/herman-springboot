package com.herman.springboot.framework.mapper;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * @Author: herman
 * @Description:
 * @Date: 2019/3/15
 */
public interface BaseMapper<T> extends Mapper<T>, MySqlMapper<T> {

}
