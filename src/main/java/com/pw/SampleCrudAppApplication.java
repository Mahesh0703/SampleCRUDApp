package com.pw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@Configuration
//@ComponentScan
//@EnableAutoCon.
public class SampleCrudAppApplication {

	public static void main(String[] args) {
		System.out.println("System Started ::");
		SpringApplication.run(SampleCrudAppApplication.class, args);
		System.out.println("System ended ::");
	}

}
