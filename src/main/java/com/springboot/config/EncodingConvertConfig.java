package com.springboot.config;

import com.springboot.impl.GBKEncodingConvert;
import com.springboot.impl.UTF8EncodingConvert;
import com.springboot.not.impl.EncodingConvert;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;

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
public class EncodingConvertConfig {

    /**
     * bean注入
     *
     * @return EncodingConvert
     */
    @Bean
    public EncodingConvert createUTF8EncodingConvert() {

        return new UTF8EncodingConvert();

    }

    /**
     * bean注入
     *
     * @return EncodingConvert
     */
    @Bean
    public EncodingConvert createGBKEncodingConvert() {

        return new GBKEncodingConvert();
    }


}
