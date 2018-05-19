package com.springboot.conf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

/**
 * Created by
 *
 * @author: liuya
 * @Date: 2018/5/20 4:21
 * @Description: quick_start
 *
 *    变量引用调用方式
 */

@Component
public class UserVariable {

    @Autowired
    private Environment environment;


    public void show(){

        System.out.println("################常量获取获取方式:"+environment.getProperty("name"));
        System.out.println("################变量引用获取获取方式:"+environment.getProperty("app.name"));
    }


}
