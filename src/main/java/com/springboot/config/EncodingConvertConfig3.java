package com.springboot.config;

import com.springboot.impl.GBKEncodingConvert2;
import com.springboot.impl.GBKEncodingConvert3;
import com.springboot.impl.UTF8EncodingConvert2;
import com.springboot.impl.UTF8EncodingConvert3;
import com.springboot.not.impl.EncodingConvert2;
import com.springboot.not.impl.EncodingConvert3;
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
 *  @Conditional放在类上,表示整个类都进行整个执行,通过方可使用,还可以放置多个配置@Conditional({UTF8Condition.class,GBKCondition.class})
 *
 */

@SpringBootConfiguration
@Conditional(UTF8Condition.class)
public class EncodingConvertConfig3 {

    /**
     * bean注入
     *
     * @return EncodingConvert
     */
    @Bean

    public EncodingConvert3 createUTF8EncodingConvert() {

        return new UTF8EncodingConvert3();

    }

    /**
     * bean注入
     *
     * @return EncodingConvert
     */
    @Bean
    public EncodingConvert3 createGBKEncodingConvert() {

        return new GBKEncodingConvert3();
    }


}
