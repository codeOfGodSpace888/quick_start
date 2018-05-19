package com.springboot.conf;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by
 *
 * @author: liuya
 * @Date: 2018/5/20 5:32
 * @Description: quick_start
 */

@Component
@ConfigurationProperties(prefix = "ds")
public class DateSourceConfig {


    private String url;

    private String driverClassName;

    private String username;

    private String password;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDriverClassName() {
        return driverClassName;
    }

    public void setDriverClassName(String driverClassName) {
        this.driverClassName = driverClassName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void show() {

        System.out.println("####################DateSourceConfig #######################");
        System.out.println("################JDBC的URL获取方式:" + url);
        System.out.println("################JDBC的driverClassName获取方式:" + driverClassName);
        System.out.println("################JDBC的username获取方式:" + username);
        System.out.println("################JDBC的password获取方式:" + password);
    }
}
