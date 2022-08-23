package com.tts.techtalenttwitter.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration //This annotation basically says that this 
               //class is a class that holds configuration information

               //One of the things you can put into a @Configuration class
               //is definitions on how to create objects that are Autowired.
public class WebMvcConfiguration implements WebMvcConfigurer {
	@Bean
	public BCryptPasswordEncoder passwordEncoder() {
		BCryptPasswordEncoder bCryptPasswordEncoder =
			new BCryptPasswordEncoder();
		return bCryptPasswordEncoder;
	}
}