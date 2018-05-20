package com.springboot.conf;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by
 *
 * @author: liuya
 * @Date: 2018/5/20 5:32
 * @Description: quick_start
 */

@Component
@ConfigurationProperties(prefix = "cs")
public class DateSourceThreeConfig {


    private List<String> hostList = new ArrayList<>();


    private String[] ports;


    public List<String> getHostList() {
        return hostList;
    }

    public void setHostList(List<String> hostList) {
        this.hostList = hostList;
    }

    public String[] getPorts() {
        return ports;
    }

    public void setPorts(String[] ports) {
        this.ports = ports;
    }

    @Override
    public String toString() {
        return "**********集合结果是:DateSourceThreeConfig{" +
                "hostList=" + hostList +
                ", ports=" + Arrays.toString(ports) +
                '}';
    }

}
