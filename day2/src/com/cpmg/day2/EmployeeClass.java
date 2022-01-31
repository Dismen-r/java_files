package com.cpmg.day2;

public class EmployeeClass {
	
	public EmployeeClass(String name, String address, int empid, int salary) {
		super();
		this.name = name;
		this.address = address;
		this.empid = empid;
		this.salary = salary;
	}
	
	
	public String toString() {
		return "EmployeeClass [name=" + name + ", address=" + address + ", empid=" + empid + ", salary=" + salary + "]";
	}
	private String name;
	private String address;
	private int empid;
	private int salary;
	
	public static void main(String[] args) {
		EmployeeClass e1=new EmployeeClass("gif","403,xyz",356,2000);
		EmployeeClass e2=new EmployeeClass("hif","404,xyz",357,3000);
		EmployeeClass e3=new EmployeeClass("jif","405,xyz",358,4000);
		System.out.println(e1.toString());
		System.out.println(e2.toString());
		System.out.println(e3.toString());
	
	}

}
