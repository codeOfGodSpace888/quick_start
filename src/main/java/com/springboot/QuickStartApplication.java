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
public class QuickStartApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(QuickStartApplication.class,args);

        // 读取配置文档获取本地ip地址
        System.out.println("*********第一种本地IP地址是:" + applicationContext.getEnvironment().getProperty("local.ip"));

        // 第二种注入获取方式
        applicationContext.getBean(UserConfig.class).show();

        // 第三种方式value注解获取
        applicationContext.getBean(UserPort.class).show();

        // 第四种整数类型获取
        applicationContext.getBean(UserTypePort.class).show();

        //第五种转化整数类型获取
        applicationContext.getBean(UserTypePort.class).show2();

        //常量引用和变量引用获取
        applicationContext.getBean(UserVariable.class).show();

        //默认值获取方式
        applicationContext.getBean(UserTomcatPortDefault.class).show();

        //默认值第二种获取方式
        applicationContext.getBean(UserTomcatPortDefault2.class).show();

        //JDBC 获取方式
        applicationContext.getBean(JdbcConfig.class).show();

        //外部文件获取方式
        applicationContext.getBean(JdbcOutConfig.class).show();

        //外部文件2获取方式
        applicationContext.getBean(JdbcOutTWOConfig.class).show();

        // 另一个注解获取方式
        applicationContext.getBean(DateSourceConfig.class).show();
        // 另一个注解获取方式,配置路径
        applicationContext.getBean(DateSourceTWOConfig.class).show();

        applicationContext.close();
    }
}
