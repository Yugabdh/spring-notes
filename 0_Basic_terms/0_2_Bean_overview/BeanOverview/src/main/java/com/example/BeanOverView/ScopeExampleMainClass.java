package com.example.BeanOverView;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.model.CharacterClass;
import com.example.model.Weapon;

/**
 * Hello world!
 *
 */
public class ScopeExampleMainClass  {
    public static void main( String[] args ) {
    	ApplicationContext context = new ClassPathXmlApplicationContext("bean-scope-example-config.xml");
    	
    	CharacterClass npc_1 = context.getBean("npc", CharacterClass.class);
    	CharacterClass npc_2 = context.getBean("npc", CharacterClass.class);
    	CharacterClass player_1 = context.getBean("player_1", CharacterClass.class);
    	CharacterClass player_2 = context.getBean("player_2", CharacterClass.class);
    	
    	System.out.println(npc_1);
    	System.out.println(npc_2);
    	System.out.println(player_1);
    	System.out.println(player_2);
    	
		/*
		 * npc is singleton bean Notice how changing weapon npc_1 results in change of
		 * weapon of npc_2
		 */
    	System.out.println(npc_1.getWeapon());

    	Weapon weapon_bow = context.getBean("bow_01", Weapon.class);
    	npc_1.setWeapon(weapon_bow);
    	System.out.println(npc_1.getWeapon());
    	System.out.println(npc_2.getWeapon());
		/*
		 * Watch how damage taken by armor is unique to characters cause we used
		 * prototype scope
		 */
    	
    	System.out.println(player_1.getName()+"'s armor "+ player_1.getArmor());
    	System.out.println(player_1.getName()+"'s armor "+ player_1.takeDamage(20));
		/*
		 * Player2's armor is intact
		 */    	
    	System.out.println(player_2.getName()+"'s armor left"+ player_2.getArmor());
    	
    	
    	((ClassPathXmlApplicationContext) context).close();
    	
    }
}
