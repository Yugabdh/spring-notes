package com.example.models;

public class Student {
	private String id;
	private String name;
	private Course course;
	
	public Student() {
		super();
		System.out.println("New Student Created");
	}	
	public Student(String id, String name, Course course) {
		super();
		this.id = id;
		this.name = name;
		this.course = course;
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
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", course=" + course + "]";
	}
	
}
