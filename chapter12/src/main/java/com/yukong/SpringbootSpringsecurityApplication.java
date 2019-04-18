package com.yukong;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.yukong.mapper")

public class SpringbootSpringsecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootSpringsecurityApplication.class, args);
	}

}
