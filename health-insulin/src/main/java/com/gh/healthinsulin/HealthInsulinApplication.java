package com.gh.healthinsulin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author gh
 */

@SpringBootApplication
public class HealthInsulinApplication {

    public static void main(String[] args) {
        SpringApplication.run(HealthInsulinApplication.class, args);
    }

}
