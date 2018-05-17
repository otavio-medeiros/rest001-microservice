package br.edu.unifor.mia.rest001.note.microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class Rest001MicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(Rest001MicroserviceApplication.class, args);
	}
}