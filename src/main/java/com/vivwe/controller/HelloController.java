package com.vivwe.controller;


import com.vivwe.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/hello")
@Configuration
public class HelloController {

    @Autowired
    private UserMapper userMapper;

    @RequestMapping(value = "/sayHello")
    public String index(String name){

        userMapper.selectByCardNo(1);

        return name + ", 你好！";
    }

    @Bean
    public String helloWorld(){
        return "hello world 2019!";
    }
}
