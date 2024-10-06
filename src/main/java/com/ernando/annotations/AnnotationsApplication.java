package com.ernando.annotations;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ernando.annotations.controllers.HomeController;

@SpringBootApplication
public class AnnotationsApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(AnnotationsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Arrays.stream(HomeController.class.getDeclaredMethods())
		.forEach(method -> System.out.println(Arrays.toString(method.getAnnotations())));
	}

}
