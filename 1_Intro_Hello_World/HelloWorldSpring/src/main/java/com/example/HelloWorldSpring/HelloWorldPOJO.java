package com.example.HelloWorldSpring;

public class HelloWorldPOJO {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "HelloWorldPOJO [name=" + name + "]";
	}
}
