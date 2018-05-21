package com.springboot;

import com.springboot.com.springboot.bean.Role;
import com.springboot.com.springboot.bean.User;
import com.springboot.com.springboot.conf.MyConf;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

/******************************
 * @Author : liuyang
 * @ClassName : QuickStartApplication
 * @Date : 2018 五月  21
 * @Time : 19:05:831
 * @Type : SpringBoot
 * @Version : 1.0
 * @Return :
 * @Description :
 *
 *
 *  是用来启用一个特性的,可以把配置文件的属性注入到bean里面去
 *
 *
 *******************************/
@EnableConfigurationProperties
@ComponentScan
@EnableAutoConfiguration
@Import({User.class,Role.class,MyConf.class})
public class QuickStartApplication4 {

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(QuickStartApplication4.class,args);

        System.out.println(applicationContext.getBean(User.class));
        System.out.println(applicationContext.getBean(Role.class));

        //导入配置文件方式
        System.out.println(applicationContext.getBeansOfType(Runnable.class));

        applicationContext.close();

    }
}
