package com.srpingboot.nostatic;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by
 *
 * @author: liuya
 * @Date: 2018/5/20 2:23
 * @Description: quick_start
 */
@ComponentScan
@EnableAutoConfiguration
public class ApplicationDemo {

    @Bean
    public Runnable createRunnable() {

        return () -> {
            System.out.println("Spring Boot is Run");
        };

    }
}
