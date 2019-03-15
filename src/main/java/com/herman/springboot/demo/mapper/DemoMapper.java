package com.herman.springboot.demo.mapper;

import com.herman.springboot.demo.entity.Demo;
import org.apache.ibatis.annotations.Param;

/**
 * @Author: herman
 * @Description:
 * @Date: 2019/3/15
 */
public interface DemoMapper {

    Demo get(@Param("id") String id);

}
