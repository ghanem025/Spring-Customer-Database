package com.example.customerdatabase;

import java.util.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class CustomerDatabaseApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerDatabaseApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx){
		return args -> {
			System.out.println("print out beans");
			String [] bean_names = ctx.getBeanDefinitionNames();
			Arrays.sort(bean_names);
			for (String b : bean_names){
				//System.out.println(b);
			}
		};
	}

}
