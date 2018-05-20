package com.springboot;

import com.springboot.conf.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

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

@SpringBootApplication
public class ReadDevOrTestApplication {

    public static void main(String[] args) {

        SpringApplication springApplication = new SpringApplication(ReadDevOrTestApplication.class);

        // 开发文档读取
//        springApplication.setAdditionalProfiles("dev");

        //指定多个
        springApplication.setAdditionalProfiles("dev","test");

        //测试文档读取(使用此注释上一行)
//        springApplication.setAdditionalProfiles("test");

        //编译器配置,注释上两行,在Edit Configuration中加入--spring.profiles.active=test,启用多个逗号多个--spring.profiles.active=test,dev


        ConfigurableApplicationContext applicationContext = springApplication.run(args);

        // 读取其他配置文档
        System.out.println("*********开发的配置文档是:" + applicationContext.getEnvironment().getProperty("jdbc.url"));

        // 读取其他配置文档
        System.out.println("*********开发的配置文档是:" + applicationContext.getEnvironment().getProperty("jdbc.name"));

        applicationContext.close();
    }
}
