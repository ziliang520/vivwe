package com.vivwe.repository;

import com.vivwe.annotation.FistLevelRepository;
import com.vivwe.annotation.HelloWorldImportSelector;
import org.springframework.context.annotation.Import;

@FistLevelRepository(value = "myFirstLevelRepository")
public class MyFirstLevelRepository {

}
