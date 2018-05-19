package com.springboot.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * Created by
 *
 * @author: liuya
 * @Date: 2018/5/20 5:24
 * @Description: quick_start
 *
 *    外部文件获取:原版文件放于 resources/out/jdbcout.properties
 *
 */

@Configuration
@PropertySource("classpath:config/jdbc.properties")
@PropertySource("file:C:/usr/jdbcout.properties")
public class JDBCOutOneProperties {
}
