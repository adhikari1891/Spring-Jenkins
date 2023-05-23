package com.example.springsecurity;

import jakarta.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringSecurityApplication {

    static Logger logger = LoggerFactory.getLogger(SpringSecurityApplication.class);

    @PostConstruct
    public void init() {
        logger.info("Jenkins is up and running");
    }


    public static void main(String[] args) {


        SpringApplication.run(SpringSecurityApplication.class, args);
    }

}
