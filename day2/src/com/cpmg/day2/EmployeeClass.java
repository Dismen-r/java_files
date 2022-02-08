package com.cpmg.day2;
import java.util.*;
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
		Scanner s=new Scanner(System.in);
		EmployeeClass e1=new EmployeeClass(s.next(),"403,xyz",s.nextInt(),2000);
		EmployeeClass e2=new EmployeeClass(s.next(),"404,xyz",s.nextInt(),3000);
		EmployeeClass e3=new EmployeeClass(s.next(),"405,xyz",s.nextInt(),4000);
		System.out.println(e1.toString());
		System.out.println(e2.toString());
		System.out.println(e3.toString());
	
	}

}
