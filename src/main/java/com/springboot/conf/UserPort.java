package com.springboot.conf;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by
 *
 * @author: liuya
 * @Date: 2018/5/20 4:08
 * @Description: quick_start
 */

@Component
public class UserPort {

    @Value("${local.port}")
    private String localPort;

    public void show(){

        System.out.println("################第三种获取方式:"+localPort);
    }

}
