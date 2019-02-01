package com.onea.playground;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource({ "classpath:${envTarget:}.properties" })
public class PlayGroundApplication {

	public static void main(String[] args) {
		SpringApplication.run(PlayGroundApplication.class, args);
	}
}
