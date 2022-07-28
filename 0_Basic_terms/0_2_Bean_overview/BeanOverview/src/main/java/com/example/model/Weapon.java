package com.example.model;

public class Weapon {
	private String id;
	private String type;
	private String name;
	private int attack;

	/*
	 * Default constructor is need cause IoC Container will call default constructor
	 * in case of Setter based DI
	 */
	public Weapon() {
		super();
	}
	public Weapon(String id, String type, String name, int attack) {
		super();
		this.id = id;
		this.type = type;
		this.name = name;
		this.attack = attack;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAttack() {
		return attack;
	}
	public void setAttack(int attack) {
		this.attack = attack;
	}
	@Override
	public String toString() {
		return "Weapon [type=" + type + ", name=" + name + ", attack=" + attack + "]";
	}
}
