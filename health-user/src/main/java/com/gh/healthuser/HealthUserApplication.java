package com.gh.healthuser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan("com.gh.domain")
@SpringBootApplication
public class HealthUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(HealthUserApplication.class, args);
    }

}
