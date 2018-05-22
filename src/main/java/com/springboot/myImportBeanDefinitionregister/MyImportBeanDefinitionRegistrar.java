package com.springboot.myImportBeanDefinitionregister;

import com.springboot.com.springboot.bean.Role;
import com.springboot.com.springboot.bean.User;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * Created by
 *
 * @author: liuya
 * @Date: 2018/5/22 19:45
 * @Description: quick_start
 * <p>
 * 向spring容器中注入bean
 */
public class MyImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {
    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata,BeanDefinitionRegistry registry) {

        BeanDefinitionBuilder beanDefinitionBuilder = BeanDefinitionBuilder.rootBeanDefinition(User.class);

        BeanDefinition beanDefinition = beanDefinitionBuilder.getBeanDefinition();

        registry.registerBeanDefinition("user",beanDefinition);


        BeanDefinitionBuilder beanDefinitionBuilder2 = BeanDefinitionBuilder.rootBeanDefinition(Role.class);

        BeanDefinition beanDefinition2 = beanDefinitionBuilder2.getBeanDefinition();

        registry.registerBeanDefinition("role",beanDefinition2);
    }
}
