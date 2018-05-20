package com.springboot.conf;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

/**
 * Created by
 *
 * @author: liuya
 * @Date: 2018/5/20 11:21
 * @Description: quick_start
 * <p>
 * 当激活某个bean时候,才创建bean
 */

@SpringBootConfiguration
public class SingleMyConfig {

    /**
     *  默认---全部生效
     * @return
     */
    @Bean
    public Runnable createRunnable1() {
        System.out.println("=====================1======");
        return () -> {
        };
    }

    /**
     * 激活test时生效
     * @return
     */
    @Bean
    @Profile("test")
    public Runnable createRunnable2() {
        System.out.println("=====================2======");
        return () -> {
        };
    }

    @Bean
    @Profile("dev")
    public Runnable createRunnable3() {
        System.out.println("=====================3======");
        return () -> {
        };
    }


}
