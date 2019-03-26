package com.vivwe.annotation;

import com.vivwe.controller.HelloController;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 *  HelloWorld {@link ImportSelector} 实现
 *
 * @author zlcai
 * @since 2019/3/26
 *
 */
public class HelloWorldImportSelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata annotationMetadata) {
        return new String[]{HelloController.class.getName()};
    }
}
