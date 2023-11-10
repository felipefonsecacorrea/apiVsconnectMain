package com.senai.apivsconnect;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "API VSConnect",version = "1.0.1", description = "Acesso dados VSConnect"))
public class ApivsconnectApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApivsconnectApplication.class, args);
	}

}
