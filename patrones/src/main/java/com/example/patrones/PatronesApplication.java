package com.example.patrones;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.model.UsuarioBuilder;

@SpringBootApplication
public class PatronesApplication {

	public static void main(String[] args) {
		SpringApplication.run(PatronesApplication.class, args);
		
		UsuarioBuilder usuario= new UsuarioBuilder();
				usuario.build("Jesús Miguel","García Durán","123456789","mi calle","42009");
	}

}
