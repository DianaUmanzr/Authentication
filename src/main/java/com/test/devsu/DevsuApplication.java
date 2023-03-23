package com.test.devsu;

import com.test.devsu.config.RsaKeyProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@EnableConfigurationProperties({RsaKeyProperties.class})
@SpringBootApplication
public class DevsuApplication {

	public static void main(String[] args) {
		SpringApplication.run(DevsuApplication.class, args);
	}

}
