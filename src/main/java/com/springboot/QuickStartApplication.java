package com.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

/******************************
 * @Author : liuyang
 * @ClassName : QuickStartApplication
 * @Date : 2018 五月  20
 * @Time : 01:05:59
 * @Type : SpringBoot
 * @Version : 1.0
 * @Return :
 * @Description :
 *******************************/

//@SpringBootApplication

@ComponentScan
@EnableAutoConfiguration
public class QuickStartApplication {

    @Bean
    public Runnable createRunnable() {

        return () -> {
            System.out.println("Spring Boot is Run");
        };

    }

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(QuickStartApplication.class,args);
        applicationContext.getBean(Runnable.class).run();
        System.out.println(applicationContext.getBean(User.class));
    }
}
