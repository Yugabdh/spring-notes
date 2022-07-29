package com.example.JavaBasedConfiguration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.configuration.ConfigurationClass;
import com.example.model.Course;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(ConfigurationClass.class);

		Course course = context.getBean("mathBean", Course.class);
		System.out.println(course);
		((AnnotationConfigApplicationContext) context).close();
	}
}
