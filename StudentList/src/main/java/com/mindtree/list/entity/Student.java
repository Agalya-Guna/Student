package com.mindtree.list.entity;

public class Student {

	int id;
	String name;
	int mark;
	public Student(int id, String name, int mark) {
		super();
		this.id = id;
		this.name = name;
		this.mark = mark;
	}
	public Student() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMark() {
		return mark;
	}
	public void setMark(int mark) {
		this.mark = mark;
	}
	
}
