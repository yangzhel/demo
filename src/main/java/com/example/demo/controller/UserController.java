package com.example.demo.controller;

import com.example.demo.dao.UserMapper;
import com.example.demo.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//证明是controller层并且返回json
@RestController
public class UserController {

    //依赖注入
    @Autowired
    UserMapper userMapper;

    @RequestMapping(value = "cs")
    public User cs() {
        //调用dao层
        User user = userMapper.selectUserByName("我的地盘");
        return user;
    }

}
