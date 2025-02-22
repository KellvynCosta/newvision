package br.itb.projeto.newvision.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

@Configuration
public class WebConfig {

	public void addCorsMappings(CorsRegistry registry){
		registry.addMapping("/**")
			.allowedMethods("GET", "POST", "PUT", 
				"PATCH", "DELETE", "OPTIONS", 
				"HEAD", "TRACE", "CONNECT")
			.allowCredentials(false).maxAge(3600);
	}
}
