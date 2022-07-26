package com.example.models;

import java.util.Arrays;

public class Course {
	private String id;
	private String name;
	private Subject subjects[];

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
	public Subject[] getSubjects() {
		return subjects;
	}
	public void setSubjects(Subject[] subjects) {
		this.subjects = subjects;
	}
	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", subjects=" + Arrays.toString(subjects) + "]";
	}
}
