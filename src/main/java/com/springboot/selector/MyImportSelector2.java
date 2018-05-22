package com.springboot.selector;

import com.springboot.annotion.diyenable.EnableLog2;
import com.springboot.com.springboot.bean.Role;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * Created by
 *
 * @author: liuya
 * @Date: 2018/5/21 23:37
 * @Description: quick_start
 * <p>
 * <p>
 * <p>
 * selectImports方法的返回值,必须是一个class(全称),该class会被spring容器所托管起来
 */
public class MyImportSelector2 implements ImportSelector {

    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {

        //获取注解属性name值
        System.out.println(importingClassMetadata.getAnnotationAttributes(EnableLog2.class.getName()));


        /**
         * 这里可以获取到注解的详细信息,然后根据信息去动态的返回需要被spring容器管理的bean
         */
        return new String[]{"com.springboot.com.springboot.bean.User",Role.class.getName()};
    }
}
