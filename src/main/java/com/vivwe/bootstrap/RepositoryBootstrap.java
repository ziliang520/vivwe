package com.vivwe.bootstrap;

import com.vivwe.repository.MyFirstLevelRepository;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Repository;

@ComponentScan(basePackages = "com.vivwe.repository") // 扫描所在的包
public class RepositoryBootstrap {

    public static void main(String[] args) {

        // 启动类并得到上下文
        ConfigurableApplicationContext context =  new SpringApplicationBuilder(RepositoryBootstrap.class)
                .web(WebApplicationType.NONE)
                .run(args);

        // myFirstLevelRepository 是否存在
        MyFirstLevelRepository myFirstLevelRepository = context.getBean("myFirstLevelRepository", MyFirstLevelRepository.class);

        System.out.println("MyFirstLevelRepository Bean : "+ myFirstLevelRepository);

        context.close();
    }
}
