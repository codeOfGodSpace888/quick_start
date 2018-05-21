package com.springboot.config;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;

/**
 * Created by
 *
 * @author: liuya
 * @Date: 2018/5/21 21:09
 * @Description: quick_start
 */
@SpringBootConfiguration
public class ConditionOnBeanConfig {


    /**
     * 根据容器中是否,存在某个bean来装配
     *
     * @return
     */
    @Bean
    @ConditionalOnBean(name = "user")
    public Runnable createRunnableBean() {

        return () -> {
        };
    }

    /**
     * 根据容器中是否不存在某个bean来装配
     *
     * @return
     */
    @Bean
    @ConditionalOnMissingBean(name = "user2")
    public Runnable createRunnableNoBean() {

        return () -> {
        };
    }
}
