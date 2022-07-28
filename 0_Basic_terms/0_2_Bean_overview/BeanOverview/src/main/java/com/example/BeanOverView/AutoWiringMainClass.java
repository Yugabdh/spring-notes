package com.example.BeanOverView;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.model.CharacterClass;


public class AutoWiringMainClass {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("bean-autowiring-example-config.xml");
    	
		CharacterClass player_1 = context.getBean("player_1", CharacterClass.class);
		CharacterClass player_2 = context.getBean("player_2", CharacterClass.class);
		CharacterClass npc = context.getBean("npc", CharacterClass.class);
    	
    	System.out.println(player_1);
    	System.out.println(player_2);
    	System.out.println(npc);
    	((ClassPathXmlApplicationContext) context).close();

	}

}
