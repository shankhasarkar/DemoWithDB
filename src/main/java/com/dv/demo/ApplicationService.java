package com.dv.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.concurrent.CountDownLatch;

@SpringBootApplication
@EnableJpaRepositories
public class ApplicationService {
    public static void main(String[] args) throws InterruptedException {
        ApplicationContext ctx = SpringApplication.run(ApplicationService.class, args);
    }
}