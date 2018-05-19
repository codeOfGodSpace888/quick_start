package com.springboot.conf;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by
 *
 * @author: liuya
 * @Date: 2018/5/20 5:27
 * @Description: quick_start
 */

@Component
public class JdbcConfig {

    @Value("${url}")
    private String url;

    @Value("${driverClassName}")
    private String driverClassName;


    public void show() {

        System.out.println("###########################################");
        System.out.println("################JDBC的URL获取方式:" + url);
        System.out.println("################JDBC的driverClassName获取方式:" + driverClassName);
    }

}
