package com.springboot;

import com.springboot.config.GsonConditionOnClassConfig;
import com.springboot.not.impl.EncodingConvert;
import com.springboot.not.impl.EncodingConvert2;
import com.springboot.not.impl.EncodingConvert3;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/******************************
 * @Author : liuyang
 * @ClassName : QuickStartApplication
 * @Date : 2018 五月  21
 * @Time : 19:05:831
 * @Type : SpringBoot
 * @Version : 1.0
 * @Return :
 * @Description :
 *******************************/
@SpringBootApplication
public class QuickStartApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(QuickStartApplication.class,args);

        // 没有自动配置装配的bean,保留所有EncodingConvert名字相关的类,其他注释,有效
        System.out.println("--------------------1-------------------------");
        System.out.println(applicationContext.getBeansOfType(EncodingConvert.class));

        //配置自动装配的bean,保留所有EncodingConvert2名字相关的类,其他注释,有效
        System.out.println("--------------------2-------------------------");
        System.out.println(System.getProperty("file.encoding"));
        System.out.println(applicationContext.getBeansOfType(EncodingConvert2.class));

        //放于类上的自动配置
        System.out.println("--------------------3-------------------------");
        System.out.println(System.getProperty("file.encoding"));
        System.out.println(applicationContext.getBeansOfType(EncodingConvert3.class));

        //获取ConditionalOnProperty,配置文档的内容存在,才会装配
        System.out.println("--------------------4-------------------------");
        System.out.println(applicationContext.getBeansOfType(Runnable.class));

        //获取ConditionalOnClass,配置类的内容存在,才会装配,注释上边的4
        System.out.println("--------------------5-------------------------");
        System.out.println(applicationContext.getBeansOfType(Runnable.class));

        //获取ConditionalOnBean,配置类的内容存在,才会装配,注释上边的4,5
        System.out.println("--------------------6-------------------------");
        System.out.println(applicationContext.getBeansOfType(Runnable.class));

        applicationContext.close();


    }
}
