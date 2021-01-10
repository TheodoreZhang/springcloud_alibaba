package com.alibaba.cloud;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableDubbo
@SpringBootApplication
public class CloudPaymentApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudPaymentApplication.class, args);
    }

}