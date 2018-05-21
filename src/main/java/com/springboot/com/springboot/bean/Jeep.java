package com.springboot.com.springboot.bean;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

/**
 * Created by
 *
 * @author: liuya
 * @Date: 2018/5/21 22:50
 * @Description: quick_start
 * @Async启用异步支持,一般和@EnableAsync一起使用
 */

@Component
public class Jeep implements Runnable {

    @Async
    @Override
    public void run() {

        try {
            for (int i = 1; i <= 10; i++) {

                System.out.println("====================" + i);

                TimeUnit.SECONDS.sleep(1);

            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}
