package com.example.server;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import springfox.documentation.oas.annotations.EnableOpenApi;

/**
 * 关闭spring security登录验证
 * @author baimuii
 * **/
@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
@EnableOpenApi
public class ServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ServerApplication.class, args);
    }

}

