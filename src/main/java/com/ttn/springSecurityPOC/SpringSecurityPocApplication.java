package com.ttn.springSecurityPOC;

import com.ttn.springSecurityPOC.dao.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = UserRepository.class)
public class SpringSecurityPocApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityPocApplication.class, args);
	}

}
