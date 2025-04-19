package com.hgh.ai;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan("com.hgh.ai.mapper")
@SpringBootApplication
public class HghAiApplication {

    public static void main(String[] args) {
        SpringApplication.run(HghAiApplication.class, args);
    }

}
