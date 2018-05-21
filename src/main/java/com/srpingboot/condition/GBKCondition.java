package com.srpingboot.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * Created by
 *
 * @author: liuya
 * @Date: 2018/5/21 20:06
 * @Description: quick_start
 */
public class GBKCondition implements Condition {


    @Override
    public boolean matches(ConditionContext conditionContext,AnnotatedTypeMetadata annotatedTypeMetadata) {

        String encoding = System.getProperty("file.encoding");

        if (encoding != null) {
            return "gbk".equals(encoding.toLowerCase());
        }

        return false;
    }


}

