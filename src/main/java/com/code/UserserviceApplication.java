package com.code;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan("com.code.dao")
@SpringBootApplication
public class UserserviceApplication{

    public static void main(String[] args) {
        SpringApplication.run(UserserviceApplication.class, args);
    }

}
