package com.cpmg.day2;
class Student{
	static class Address{//nested static class
		int houseno;
		String streetname;
		public void print() {
			System.out.println("nested");
		}
	}
	static {//static block-executed automatically-first of the program-no need to call
		System.out.println("Static");
	}
	public Student(int rollno, String name) {//click source and generate constructor
		this.rollno = rollno;
		this.name = name;
	}
	private int rollno;
	
	public String toString() {//click source and generate tostring
		return "Student [rollno=" + rollno + ", name=" + name + "]";
	}
	private String name;
	static String schoolname;
}
public class MyStatic {
	public static void main(String[] args) {
		Student.schoolname="ABC school";
		Student S1=new Student(1001,"def");
		Student S2=new Student(1002,"ghi");
		System.out.println(S2);
	}

}
