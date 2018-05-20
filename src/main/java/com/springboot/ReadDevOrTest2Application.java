package com.springboot;

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
public class ReadDevOrTest2Application {

    public static void main(String[] args) {

        SpringApplication springApplication = new SpringApplication(ReadDevOrTest2Application.class);

        // 开发文档读取
        springApplication.setAdditionalProfiles("dev");

        //指定多个
//        springApplication.setAdditionalProfiles("dev","test");

        ConfigurableApplicationContext applicationContext = springApplication.run(args);

        applicationContext.close();
    }
}
