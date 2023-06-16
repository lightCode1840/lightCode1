package com.example.gitgit;

import com.example.gitgit.Entity.User;
import com.example.gitgit.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GitgitApplicationTests {
    @Autowired
    private UserMapper userMapper;

    @Test
    void contextLoads() {
    }

    @Test
    public void find(){
        User user=userMapper.selectById(2);
        System.out.println(user);
    }
}
