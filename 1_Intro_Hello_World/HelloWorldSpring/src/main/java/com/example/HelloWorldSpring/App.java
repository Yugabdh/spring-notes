package com.example.HelloWorldSpring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext cntxt = new ClassPathXmlApplicationContext("bean-config.xml");
    	
    	HelloWorldPOJO helloWorldPOJO = cntxt.getBean(HelloWorldPOJO.class, "HelloWorldPOJO");
    	
    	System.out.println("Hello " + helloWorldPOJO.getName());
    	
    	((ClassPathXmlApplicationContext)cntxt).close();
    }
}
