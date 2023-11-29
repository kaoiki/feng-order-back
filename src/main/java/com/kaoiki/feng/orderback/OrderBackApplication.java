package com.kaoiki.feng.orderback;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootVersion;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
public class OrderBackApplication {

    public static final Logger logger = LoggerFactory.getLogger(OrderBackApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(OrderBackApplication.class, args);
        logger.warn("now springboot version is " + SpringBootVersion.getVersion());
    }

}
