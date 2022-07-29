package com.example.model;

public class Course {
	private String id;
	private String name;
	private Subject subject;
	public Course() {
		super();
	}
	public Course(String id, String name, Subject subject) {
		super();
		this.id = id;
		this.name = name;
		this.subject = subject;
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
	public Subject getSubject() {
		return subject;
	}
	public void setSubject(Subject subject) {
		this.subject = subject;
	}
	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", subject=" + subject + "]";
	}
}
