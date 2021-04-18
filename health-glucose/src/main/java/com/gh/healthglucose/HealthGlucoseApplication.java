package com.gh.healthglucose;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan("com.gh.domain")
@SpringBootApplication
public class HealthGlucoseApplication {

    public static void main(String[] args) {
        SpringApplication.run(HealthGlucoseApplication.class, args);
    }

}
