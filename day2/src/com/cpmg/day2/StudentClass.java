package com.cpmg.day2;

public class StudentClass {
	public StudentClass(String name, String address, int rollno, int fees) {
		this.name = name;
		this.address = address;
		this.rollno = rollno;
		this.fees = fees;
	}
	public String toString() {
		return "StudentClass [name=" + name + ", address=" + address + ", rollno=" + rollno + ", fees=" + fees + "]";
	}
	private String name;
	private String address;
	private int rollno;
	private int fees;
	
	public static void main(String[] args) {
		StudentClass s1=new StudentClass("gif","403,xyz",356,2000);
		StudentClass s2=new StudentClass("hif","404,xyz",357,3000);
		StudentClass s3=new StudentClass("jif","405,xyz",358,4000);
		System.out.println(s2.toString());
	}
}
