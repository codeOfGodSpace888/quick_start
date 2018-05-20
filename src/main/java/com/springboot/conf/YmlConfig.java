package com.springboot.conf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

/**
 * Created by
 *
 * @author: liuya
 * @Date: 2018/5/20 7:42
 * @Description: quick_start
 *
 *
 *     获取yml文件内容
 *
 */

@Component
public class YmlConfig {


    @Autowired
    private Environment environment;


    public void show(){

        System.out.println("################yml获取方式:"+environment.getProperty("age"));
    }
}
