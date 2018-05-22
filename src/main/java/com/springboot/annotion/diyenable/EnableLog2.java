package com.springboot.annotion.diyenable;

import com.springboot.myImportBeanDefinitionregister.MyImportBeanDefinitionRegistrar;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * Created by
 *
 * @author: liuya
 * @Date: 2018/5/22 19:28
 * @Description: quick_start
 * <p>
 * 创建注解类,以此获取注解信息
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import(MyImportBeanDefinitionRegistrar.class)
public @interface EnableLog2 {

    String name();
}
