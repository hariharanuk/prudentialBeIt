package com.prudential.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.prudential.controller.ProductController;



@Configuration
@EnableAutoConfiguration
@ComponentScan({"com.prudential.controller"})
@ComponentScan(basePackageClasses = ProductController.class)
public class PrudencialBeItApplication {

	public static void main(String[] args) {
		SpringApplication.run(PrudencialBeItApplication.class, args);
	}

}
