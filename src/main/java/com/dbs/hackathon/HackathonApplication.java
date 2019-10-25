package com.dbs.hackathon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class HackathonApplication {
    public static void main(String[] args) {
        System.out.println("Test");
        SpringApplication.run(HackathonApplication.class);
    }
}
