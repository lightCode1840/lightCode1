package com.example.gitgit.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lilepingstart
 * @creat 2023-06-16 17:49
 */
@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String hello(){
        System.out.println("hello");
        return "helloString";
    }



    @RequestMapping("saynihao")
    public String nihao(){
        System.out.println("nihao");
        return "nihao";
    }


}
