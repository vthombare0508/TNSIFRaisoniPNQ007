package com.tnsif.markerinterface;

public class Student implements  Registrable{
	
	private int uid;
	private String name;
	private String course;
	
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public Student(int uid, String name, String course) {
		super();
		this.uid = uid;
		this.name = name;
		this.course = course;
	}
	
	
	
	public Student() {
		super();
	}
	
	
	@Override
	public String toString() {
		return "Student [uid=" + uid + ", name=" + name + ", course=" + course + "]";
	}

	
	
	

}
