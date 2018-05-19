package com.springboot.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * Created by
 *
 * @author: liuya
 * @Date: 2018/5/20 5:24
 * @Description: quick_start
 */

@Configuration
@PropertySource("classpath:config/jdbc.properties")
public class JDBCProperties {
}
