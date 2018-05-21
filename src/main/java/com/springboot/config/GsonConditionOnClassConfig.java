package com.springboot.config;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.Bean;

/**
 * Created by
 *
 * @author: liuya
 * @Date: 2018/5/21 21:08
 * @Description: quick_start
 */
@SpringBootConfiguration
public class GsonConditionOnClassConfig {

    /**
     * 需要加入gson依赖, 某个类存在就装配
     * 存在某个类才装配
     *
     * @return
     */
    @Bean
    @ConditionalOnClass(name = "com.google.code.gson")
    public Runnable createGsonRunnable() {

        return () -> {
        };
    }
}
