package com.spring.blueprintaop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class BlueprintAopApplication {

	public static void main(String[] args) {
		SpringApplication.run(BlueprintAopApplication.class, args);
	}

}
