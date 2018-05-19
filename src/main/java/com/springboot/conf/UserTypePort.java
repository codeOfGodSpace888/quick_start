package com.springboot.conf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

/**
 * Created by
 *
 * @author: liuya
 * @Date: 2018/5/20 4:14
 * @Description: quick_start
 * <p>
 * <p>
 * 通过整数类型获取port,但是ip不行
 */

@Component
public class UserTypePort {

    @Value("${local.port}")
    private Integer localPort;

    @Autowired
    private Environment environment;


    public void show() {

        System.out.println("################第四种整数获取方式:" + localPort);
    }

    public void show2() {

        System.out.println("################第五种转化为整数获取方式:" + environment.getProperty("local.port",Integer.class));
    }

}
