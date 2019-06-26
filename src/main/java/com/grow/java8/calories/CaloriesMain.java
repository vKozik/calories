package com.grow.java8.calories;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan({"com.grow.java8.calories"})
public class CaloriesMain {
    public static void main(String[] args) {
        SpringApplication.run(CaloriesMain.class, args);
    }
}
