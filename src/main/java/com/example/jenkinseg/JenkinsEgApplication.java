package com.example.jenkinseg;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinsEgApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(JenkinsEgApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("first jenkins app");
    }
}
