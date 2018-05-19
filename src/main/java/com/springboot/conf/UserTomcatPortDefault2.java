package com.springboot.conf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

/**
 * Created by
 *
 * @author: liuya
 * @Date: 2018/5/20 4:32
 * @Description: quick_start
 */

@Component
public class UserTomcatPortDefault2 {


    @Autowired
    private Environment environment;

    public void show() {
        System.out.println("################设置默认值方法二获取方式:" + environment.getProperty("tomcat.port","999999"));
    }
}
