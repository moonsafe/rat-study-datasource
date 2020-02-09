package com.rat.study;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.rat.study.dataSource.dao")
public class DataSourceApp {
    public static void main(String[] args) {
        SpringApplication.run(DataSourceApp.class, args);
    }
}
