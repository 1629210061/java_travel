package com.hwh.java_travel;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
@MapperScan(basePackages = "com.hwh.mapper")
public class JavaTravelApplication {

    public static void main(String[] args) {
        SpringApplication.run(JavaTravelApplication.class, args);
    }

}
