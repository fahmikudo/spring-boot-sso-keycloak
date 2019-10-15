package id.web.fahmikudo.idp.authkeycloak;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAdminServer
public class AuthKeycloakApplication {

	public static void main(String[] args) {
		SpringApplication.run(AuthKeycloakApplication.class, args);
	}

}
