package io.github.m4rciooliveira.orderbot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class OrderbotApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrderbotApplication.class, args);
	}

}
