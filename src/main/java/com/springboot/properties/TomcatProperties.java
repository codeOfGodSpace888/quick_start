package com.springboot.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by
 *
 * @author: liuya
 * @Date: 2018/5/21 22:22
 * @Description: quick_start
 */
@Component
@ConfigurationProperties(prefix = "tomcat")
public class TomcatProperties {


    private String host;

    private Integer port;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    @Override
    public String toString() {
        return "TomcatProperties{" +
                "host='" + host + '\'' +
                ", port=" + port +
                '}';
    }
}
