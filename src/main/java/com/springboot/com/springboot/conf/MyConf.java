package com.springboot.com.springboot.conf;

import org.springframework.context.annotation.Bean;

/**
 * Created by
 *
 * @author: liuya
 * @Date: 2018/5/21 23:28
 * @Description: quick_start
 */
public class MyConf {

    @Bean
    public Runnable createRunnable2() {

        return () -> {
        };

    }
}
