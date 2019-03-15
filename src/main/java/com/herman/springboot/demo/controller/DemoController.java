package com.herman.springboot.demo.controller;

import com.herman.springboot.demo.entity.Demo;
import com.herman.springboot.demo.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: herman
 * @Description:
 * @Date: 2019/3/14
 */
@RestController
@RequestMapping("demo")
public class DemoController {

    @Autowired
    private DemoService demoService;

    @RequestMapping("get")
    public Demo get(@RequestParam("id") String id) {
        return demoService.get(id);
    }

}
