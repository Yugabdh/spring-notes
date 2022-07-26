package com.example.SetterBasedDI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.models.Student;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("bean-config.xml");
        
        Student student1 = ctx.getBean("student_1", Student.class);
        System.out.println(student1);
        
        Student student2 = ctx.getBean("student_2", Student.class);
        System.out.println(student2);
        
        ((ClassPathXmlApplicationContext) ctx).close();
    }
}
