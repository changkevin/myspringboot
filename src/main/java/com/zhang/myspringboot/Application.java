package com.zhang.myspringboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
@MapperScan("com.zhang.myspringboot.mapper")
public class Application {
	
	public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(Application.class, args);
    }
}