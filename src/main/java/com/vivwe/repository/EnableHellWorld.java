package com.vivwe.repository;

import com.vivwe.annotation.HelloWorldImportSelector;
import org.springframework.context.annotation.Import;

@Import(HelloWorldImportSelector.class)
public @interface EnableHellWorld {


}
