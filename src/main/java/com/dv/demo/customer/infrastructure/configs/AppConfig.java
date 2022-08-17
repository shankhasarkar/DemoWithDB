package com.dv.demo.customer.infrastructure.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.CountDownLatch;

@Configuration
public class AppConfig {
    @Bean
    public CountDownLatch closeLatch() {
        return new CountDownLatch(1);
    }
}
