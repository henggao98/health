package com.gh.healthuser.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.oas.annotations.EnableOpenApi;

/**
 * @author HENG GAO
 * @version 1.0
 * @date 2021/4/18 23:39
 */

@Configuration
//启用swagger3
@EnableOpenApi
@EntityScan(basePackages = {"com.gh.domain"})
public class AppConfig {
}
