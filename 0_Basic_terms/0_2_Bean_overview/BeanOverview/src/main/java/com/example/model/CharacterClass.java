package com.example.model;

public class CharacterClass {
	private String id;
	private String name;
	private Weapon weapon;
	private Armor armor;
	
	/*
	 * Default constructor is need cause IoC Container will call default constructor
	 * in case of Setter based DI
	 */
	public CharacterClass() {
		super();
	}
	public CharacterClass(String id, String name, Weapon weapon, Armor armor) {
		super();
		this.id = id;
		this.name = name;
		this.weapon = weapon;
		this.armor = armor;
	}
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Weapon getWeapon() {
		return weapon;
	}

	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}

	public Armor getArmor() {
		return armor;
	}

	public void setArmor(Armor armor) {
		this.armor = armor;
	}
	

	public int takeDamage(int attack) {
		return this.armor.takeDamage(attack);
	}

	@Override
	public String toString() {
		return "Character [id=" + id + ", name=" + name + ", weapon=" + weapon + ", armor="
				+ armor + "]";
	}
	
}
