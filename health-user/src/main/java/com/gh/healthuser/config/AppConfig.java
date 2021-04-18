package com.gh.healthuser.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author HENG GAO
 * @version 1.0
 * @date 2021/4/18 23:39
 */


//开启注解类
@Configuration
//扫描其他模块中的实体类
@EntityScan(basePackages={"com.gh.domain"})
public class AppConfig {
}
