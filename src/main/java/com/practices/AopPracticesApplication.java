package com.practices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@ComponentScan(basePackages = "com.*")
@EnableAspectJAutoProxy(proxyTargetClass=true)  
public class AopPracticesApplication {

	public static void main(String[] args) {
		SpringApplication.run(AopPracticesApplication.class, args);
	}

}
