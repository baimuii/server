package com.example.server;

import lombok.SneakyThrows;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;

@SpringBootTest
class ServerApplicationTests {

    @Autowired
    DataSource dataSource;
    @SneakyThrows
    @Test
    void contextLoads() {
        //测试数据库连接
        System.out.println(dataSource.getClass());
        System.out.println(dataSource.getConnection());
    }

}
