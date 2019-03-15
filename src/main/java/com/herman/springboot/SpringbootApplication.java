package com.herman.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: herman
 * @Description:
 * @Date: 2019/3/13
 */
@RestController
@SpringBootApplication
@MapperScan("com.herman.springboot")
public class SpringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootApplication.class, args);
    }


    @RequestMapping("/")
    public String index() {
        return "Hello world";
    }

}
