package com.example.finanancialdashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@SpringBootApplication
public class FinanancialDashboardApplication {

    public static void main(String[] args) {
        SpringApplication.run(FinanancialDashboardApplication.class, args);
    }

}
