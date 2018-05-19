package com.springboot.conf;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by
 *
 * @author: liuya
 * @Date: 2018/5/20 5:32
 * @Description: quick_start
 */

@Component
public class JdbcOutTWOConfig {

    @Value("${url}")
    private String url;

    @Value("${driverClassName}")
    private String driverClassName;

    @Value("${username}")
    private String username;

    @Value("${password}")
    private String password;

    public void show() {

        System.out.println("###########################################");
        System.out.println("################JDBC的URL获取方式2:" + url);
        System.out.println("################JDBC的driverClassName获取方式2:" + driverClassName);
        System.out.println("################JDBC的username获取方式2:" + username);
        System.out.println("################JDBC的password获取方式2:" + password);
    }
}
