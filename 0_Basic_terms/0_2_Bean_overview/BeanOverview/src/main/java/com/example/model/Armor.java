package com.example.model;

public class Armor {
	private String id;
	private String type;
	private int hitPoint;
	private int healthLeft;

	/*
	 * Default constructor is need cause IoC Container will call default constructor
	 * in case of Setter based DI
	 */
	public Armor() {
		super();
	}
	public Armor(String id, String type, int hitPoint, int healthLeft) {
		super();
		this.id = id;
		this.type = type;
		this.hitPoint = hitPoint;
		this.healthLeft = healthLeft;
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
	public int getHitPoint() {
		return hitPoint;
	}
	public void setHitPoint(int hitPoint) {
		this.hitPoint = hitPoint;
	}
	public int getHealthLeft() {
		return healthLeft;
	}
	public void setHealthLeft(int healthLeft) {
		this.healthLeft = healthLeft;
	}
	
	public int takeDamage(int attack) {
		this.healthLeft -= attack;
		return this.healthLeft;
	}
	
	@Override
	public String toString() {
		return "Armor [type=" + type + ", hitPoint=" + hitPoint + ", healthLeft=" + healthLeft + "]";
	}
}
