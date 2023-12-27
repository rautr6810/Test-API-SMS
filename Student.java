package com.jbk.sms.SMS;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {
	@Id
	private int sid;
	private String sfirstname;
	private String slastname;
	private Date sDOB;
	private char gender;
	private int pincode;
	private double salary;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int sid, String sfirstname, String slastname, Date sDOB, char gender, int pincode, double salary) {
		super();
		this.sid = sid;
		this.sfirstname = sfirstname;
		this.slastname = slastname;
		this.sDOB = sDOB;
		this.gender = gender;
		this.pincode = pincode;
		this.salary = salary;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSfirstname() {
		return sfirstname;
	}
	public void setSfirstname(String sfirstname) {
		this.sfirstname = sfirstname;
	}
	public String getSlastname() {
		return slastname;
	}
	public void setSlastname(String slastname) {
		this.slastname = slastname;
	}
	public Date getsDOB() {
		return sDOB;
	}
	public void setsDOB(Date sDOB) {
		this.sDOB = sDOB;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sfirstname=" + sfirstname + ", slastname=" + slastname + ", sDOB=" + sDOB
				+ ", gender=" + gender + ", pincode=" + pincode + ", salary=" + salary + "]";
	}
	
}
