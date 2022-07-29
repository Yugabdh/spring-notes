package com.example.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.example.model.Course;
import com.example.model.Subject;

@Configuration
public class ConfigurationClass {
	
	@Bean
	public Subject getSubject() {
		return new Subject("01", "Algebra");
	}
	
	@Bean(name="mathBean")
	@Scope(value = "prototype")
	public Course getCourse() {
		return new Course("01", "Maths", getSubject());
	}
}
