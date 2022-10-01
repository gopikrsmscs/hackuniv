package com.hackuniv.management;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;


@SpringBootApplication
public class HackunivApplication {

	public static void main(String[] args) {
		SpringApplication.run(HackunivApplication.class, args);
	}

}
