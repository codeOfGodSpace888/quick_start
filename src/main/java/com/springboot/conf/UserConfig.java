package com.springboot.conf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

/**
 * Created by
 *
 * @author: liuya
 * @Date: 2018/5/20 4:04
 * @Description: quick_start
 *
 *
 *      第二种获取文档方式
 */

@Component
public class UserConfig {


    @Autowired
    private Environment environment;


    public void show(){

        System.out.println("################第二种获取方式:"+environment.getProperty("local.ip"));
    }
}
