package com.bk.abc;

public class Student {
	private String name;
	private String addres;
	private String branch;
	private int rollno;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddres() {
		return addres;
	}
	public void setAddres(String addres) {
		this.addres = addres;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	
	public Student(String name, String addres, String branch, int rollno) {
		this.name = name;
		this.addres = addres;
		this.branch = branch;
		this.rollno = rollno;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", addres=" + addres + ", branch=" + branch + ", rollno=" + rollno + "]";
	}
	
	
}
