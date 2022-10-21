package com.github.erikpedro.lab;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * The type Lab padroes projetos spring application.
 */
@EnableFeignClients
@SpringBootApplication
public class LabPadroesProjetosSpringApplication {

	/**
	 * The entry point of application.
	 *
	 * @param args the input arguments
	 */
	public static void main(String[] args) {
		SpringApplication.run(LabPadroesProjetosSpringApplication.class, args);
	}

}
