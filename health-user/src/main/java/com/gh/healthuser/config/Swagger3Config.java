package com.gh.healthuser.config;

import io.swagger.annotations.ApiOperation;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

/**
 * @author HENG GAO
 * @version 1.0
 * @date 2021/4/19 01:26
 */


@Configuration
public class Swagger3Config {
	//摘要类
	@Bean
	public Docket createRestApi() {
		return new Docket(DocumentationType.OAS_30)
			.apiInfo(apiInfo())
			.select()
			.apis(RequestHandlerSelectors.withMethodAnnotation(ApiOperation.class))
			.paths(PathSelectors.any())
			.build();
	}

	private ApiInfo apiInfo() {
		return new ApiInfoBuilder()
			.title("Swagger3接口文档")
			.description("更多请咨询服务开发者。")
			.contact(new Contact("gh", "http://henggao98.github.io", "allenghmanchester@gmail.com"))
			.version("1.0")
			.build();
	}
}
