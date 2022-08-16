package com.dv.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class ApplicationService {
    static Logger log = LoggerFactory.getLogger(ApplicationService.class.getName());

    @Value("${spring.jpa.hibernate.ddl-auto}")
    private static String ddlAuto;

    public static void main(String[] args) {
        SpringApplication.run(ApplicationService.class, args);
        System.out.println("Rajarsi" + ddlAuto);
        log.info("Rajarsi" + ddlAuto);
    }
}
