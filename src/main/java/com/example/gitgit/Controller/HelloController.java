package com.example.gitgit.Controller;

import com.example.gitgit.Entity.User;
import com.example.gitgit.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author lilepingstart
 * @creat 2023-06-16 17:49
 */
@RestController
public class HelloController {
    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/hello")
    public String hello(){
        System.out.println("hello");
        return "helloString";
    }

    @RequestMapping("/findUser")
    public User findAllUser(){
        User user = userMapper.selectById(1);
        System.out.println(user);
        return user;
    }


    @RequestMapping("saynihao")
    public String nihao(){
        System.out.println("nihao");
        return "nihao";
    }


}
