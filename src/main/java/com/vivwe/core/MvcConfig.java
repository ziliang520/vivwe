package com.vivwe.core;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/***
 * MVC配置
 */
@Configuration
public class MvcConfig implements WebMvcConfigurer {

    /***
     * 添加无需验证登录规则， 添加后这些路径可以绕过验证，当然，这需要使用spring secure验证机制
     * @param registry
     */
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/hello").setViewName("sayHello");

        //....
    }
}
