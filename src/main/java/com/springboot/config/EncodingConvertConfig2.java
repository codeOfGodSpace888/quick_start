package com.springboot.config;

import com.springboot.impl.GBKEncodingConvert2;
import com.springboot.impl.UTF8EncodingConvert2;
import com.springboot.not.impl.EncodingConvert2;
import com.srpingboot.condition.GBKCondition;
import com.srpingboot.condition.UTF8Condition;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;

/**
 * Created by
 *
 * @author: liuya
 * @Date: 2018/5/21 19:51
 * @Description: quick_start
 * <p>
 * 配置文档类
 */

@SpringBootConfiguration
public class EncodingConvertConfig2 {

    /**
     * bean注入
     *
     * @return EncodingConvert
     */
    @Bean
    @Conditional(UTF8Condition.class)
    public EncodingConvert2 createUTF8EncodingConvert() {

        return new UTF8EncodingConvert2();

    }

    /**
     * bean注入
     *
     * @return EncodingConvert
     */
    @Bean
    @Conditional(GBKCondition.class)
    public EncodingConvert2 createGBKEncodingConvert() {

        return new GBKEncodingConvert2();
    }


}
