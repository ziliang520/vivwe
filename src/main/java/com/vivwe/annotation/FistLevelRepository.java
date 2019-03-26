package com.vivwe.annotation;


import org.springframework.core.annotation.AliasFor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import java.lang.annotation.*;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Repository // 派生自Repository
public @interface FistLevelRepository {

    @AliasFor(annotation = Component.class)
    String value() default ""; // 签名要保持一致
}
