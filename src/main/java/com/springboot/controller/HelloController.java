package com.springboot.controller;

import com.springboot.QuickStartApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by
 *
 * @author: liuya
 * @Date: 2018/5/20 1:00
 * @Description: quick_start
 */

@RestController
public class HelloController {


    @RequestMapping(value = "/hello")
    public String getHello() {

        return "Hello World !!!";
    }


    public static void main(String[] args) {
        SpringApplication.run(QuickStartApplication.class, args);
    }

}
