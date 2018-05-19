package com.springboot.conf;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by
 *
 * @author: liuya
 * @Date: 2018/5/20 4:26
 * @Description: quick_start
 * <p>
 * <p>
 * 默认值获取方式
 */

@Component
public class UserTomcatPortDefault {

    /**
     * 必须有配置项,不为空默认值需要给
     */
    @Value("${tomcat.port:9090}")
    private String tomcatPort;

    public void show() {

        System.out.println("################默认值获取方式:" + tomcatPort);


    }


}
