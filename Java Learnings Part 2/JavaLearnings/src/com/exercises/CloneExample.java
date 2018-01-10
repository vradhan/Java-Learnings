package com.exercises;


class Student {
	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}


public class CloneExample implements Cloneable{

	String myname;
	Student student;
	public String getMyname() {
		return myname;
	}
	public void setMyname(String myname) {
		this.myname = myname;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	
	public static void main(String a[]){
		CloneExample ce= new CloneExample();
		ce.setMyname("vishnu");
		
	}
}
