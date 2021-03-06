package com.herman.springboot.demo.service;

import com.herman.springboot.framework.mapper.build.dao.DemoMapper;
import com.herman.springboot.framework.mapper.build.entity.Demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: herman
 * @Description:
 * @Date: 2019/3/14
 */
@Service
public class DemoService {

    @Autowired
    private DemoMapper demoDao;

    public Demo get(String id) {
        return demoDao.selectByPrimaryKey(id);
    }
}
