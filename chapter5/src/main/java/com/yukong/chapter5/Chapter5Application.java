package com.yukong.chapter5;

import com.yukong.chapter5.aop.DynamicDataSourceAnnotationAdvisor;
import com.yukong.chapter5.aop.DynamicDataSourceAnnotationInterceptor;
import com.yukong.chapter5.register.DynamicDataSourceRegister;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Import(DynamicDataSourceRegister.class)
@MapperScan("com.yukong.chapter5.repository")
@SpringBootApplication
@EnableTransactionManagement
public class Chapter5Application {
    @Bean
    public DynamicDataSourceAnnotationAdvisor dynamicDatasourceAnnotationAdvisor() {
        return new DynamicDataSourceAnnotationAdvisor(new DynamicDataSourceAnnotationInterceptor());
    }
    public static void main(String[] args) {
        SpringApplication.run(Chapter5Application.class, args);
    }
}
