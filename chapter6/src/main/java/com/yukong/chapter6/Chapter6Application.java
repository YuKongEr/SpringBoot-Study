package com.yukong.chapter6;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.security.RunAs;

@SpringBootApplication
public class Chapter6Application {

    public static void main(String[] args) {
        SpringApplication.run(Chapter6Application.class, args);
    }
}
