package com.springboot.conf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.env.EnvironmentPostProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.Environment;
import org.springframework.core.env.PropertiesPropertySource;
import org.springframework.stereotype.Component;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by
 *
 * @author: liuya
 * @Date: 2018/5/20 10:29
 * @Description: quick_start
 */

@Component
public class MyEnvironmentPostProcessor implements EnvironmentPostProcessor {

    @Autowired
    private Environment environment;

    @Override
    public void postProcessEnvironment(ConfigurableEnvironment configurableEnvironment,SpringApplication springApplication) {

        try(InputStream inputStream = new FileInputStream("application.properties")){

            Properties properties = new Properties();

            properties.load(inputStream);

            PropertiesPropertySource propertiesPropertySource = new PropertiesPropertySource("my",properties);

            configurableEnvironment.getPropertySources().addLast(propertiesPropertySource);


        }catch (IOException e){
            e.printStackTrace();
        }

    }

    public void show(){

        System.out.println("################EnvironmentPostProcessor获取方式:"+environment.getProperty("springboot.name"));
    }
}
