package src;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication() // exclude = { SecurityAutoConfiguration.class }
@EnableCaching
public class ProntoInteligenteApplication extends SpringBootServletInitializer {
	
	public static void main(String[] args) {
		SpringApplication.run(ProntoInteligenteApplication.class, args);
	}
	

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(ProntoInteligenteApplication.class);
	}

}
