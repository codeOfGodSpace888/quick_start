package com.srpingboot.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * Created by
 *
 * @author: liuya
 * @Date: 2018/5/21 20:09
 * @Description: quick_start
 */
public class UTF8Condition implements Condition {
    @Override
    public boolean matches(ConditionContext conditionContext,AnnotatedTypeMetadata annotatedTypeMetadata) {

        // 会识别到本地系统采用的编码方式
        String encoding = System.getProperty("file.encoding");

        if (encoding != null) {
            return "utf-8".equals(encoding.toLowerCase());
        }

        return false;
    }
}
