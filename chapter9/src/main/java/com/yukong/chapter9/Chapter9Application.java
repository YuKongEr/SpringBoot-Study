package com.yukong.chapter9;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author yukong
 * @data 2018年8月27日19:00:21
 */
@EnableScheduling
@SpringBootApplication
public class Chapter9Application {

    public static void main(String[] args) {
        SpringApplication.run(Chapter9Application.class, args);
    }
}
