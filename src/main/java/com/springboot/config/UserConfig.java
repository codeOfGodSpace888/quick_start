package com.springboot.config;

import com.google.gson.Gson;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;

/**
 * Created by
 *
 * @author: liuya
 * @Date: 2018/5/21 20:47
 * @Description: quick_start
 */
@SpringBootConfiguration
public class UserConfig {

    /**
     * 修改 application.properties的runnable.enabled=true ,就会生效.
     * matchIfMissing配置没有的时候,也会生效,注释掉runnable.enabled
     *
     * @return Runnable
     */
    @Bean
    @ConditionalOnProperty(name = "runnable.enabled", havingValue = "true")
    public Runnable createRunnable() {

        return () -> {
        };


    }

    /**
     * 修改 application.properties的runnable.enabled=true ,就会生效.
     * matchIfMissing配置没有的时候,也会生效,注释掉runnable.enabled
     * 等于某个值的时候才装配
     *
     * @return Runnable
     */
    @Bean
    @ConditionalOnProperty(name = "runnable.enabled", havingValue = "true", matchIfMissing = true)
    public Runnable createRunnable2() {

        return () -> {
        };
    }



}
