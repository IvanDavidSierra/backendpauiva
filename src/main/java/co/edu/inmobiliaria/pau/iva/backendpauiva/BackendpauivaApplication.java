package co.edu.inmobiliaria.pau.iva.backendpauiva;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "co.edu.inmobiliaria.pau.iva.backendpauiva")
public class BackendpauivaApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackendpauivaApplication.class, args);
	}

}
