package com.springboot;

import com.srpingboot.nostatic.ApplicationDemo;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by
 *
 * @author: liuya
 * @Date: 2018/5/20 2:18
 * @Description: quick_start
 * <p>
 * 指定多个源,调用非springApplication方法
 */


public class ManyApplication {

    public static void main(String[] args) {

        // new实例对象调用
//        SpringApplication application = new SpringApplication();
//
//        // 可以指定多个源的方式
//        Set<String> sets = new HashSet<>();
//        sets.add(ApplicationDemo.class.getName());
//        sets.add(User.class.getName());
//        application.setSources(sets);

        //构造函数指定方式
        SpringApplication application = new SpringApplication(ApplicationDemo.class,User.class);



        ConfigurableApplicationContext applicationContext = application.run(args);
        applicationContext.getBean(Runnable.class).run();
        System.out.println(applicationContext.getBean(User.class));
    }


}
