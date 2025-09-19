package com.example.aicodesu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.aicodesu.mapper")
public class AiCodeSuApplication {

    public static void main(String[] args) {
        SpringApplication.run(AiCodeSuApplication.class, args);
    }

}
