package com.springboot.selector;

import com.springboot.com.springboot.bean.Role;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * Created by
 *
 * @author: liuya
 * @Date: 2018/5/21 23:37
 * @Description: quick_start
 */
public class MyImportSelector implements ImportSelector {

    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        return new String[]{"com.springboot.com.springboot.bean.User",Role.class.getName()};
    }
}
