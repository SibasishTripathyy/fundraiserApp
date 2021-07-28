package com.ngo.fundraiser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

//import jdk.jfr.Enabled;

@SpringBootApplication
//@EnableJpaRepositories(basePackages = "com.ngo.fundraiser")
public class FundraiserApplication {

	public static void main(String[] args) {
		SpringApplication.run(FundraiserApplication.class, args);
	}

}
