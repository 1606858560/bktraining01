package com.bk.abc;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Students {
	private int no;
	private String first;
	private String last;
	private String email;
	private Date dob;
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getFirst() {
		return first;
	}
	public void setFirst(String first) {
		this.first = first;
	}
	public String getLast() {
		return last;
	}
	public void setLast(String last) {
		this.last = last;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public Students(int no, String first, String last, String email, String dob) {
		super();
		this.no = no;
		this.first = first;
		this.last = last;
		this.email = email;
		try {
			Date date = new SimpleDateFormat("dd/MM/yyyy").parse(dob);
			this.dob = date;
		} catch(ParseException pe) {
			System.out.println("Parsing the date exception");
		}
		
	}
	
	@Override
	public String toString() {
		return "Students [no=" + no + ", first=" + first + ", last=" + last + ", email=" + email + ", dob=" + dob + "]";
	}

}
