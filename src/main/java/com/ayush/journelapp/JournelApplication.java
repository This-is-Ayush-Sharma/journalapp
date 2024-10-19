package com.ayush.journelapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.MongoDatabaseFactory;
import org.springframework.data.mongodb.MongoTransactionManager;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
//@EnableMongoRepositories(basePackages = "com.ayush.journelapp.repository")
@EnableTransactionManagement
public class JournelApplication {
    public static void main(String[] args) {
        SpringApplication.run(JournelApplication.class, args);
    }
}
