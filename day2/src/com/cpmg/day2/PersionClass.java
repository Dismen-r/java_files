package com.cpmg.day2;

public class PersionClass {
public PersionClass(String name, String address, String father, String mother) {
		this.name = name;
		this.address = address;
		this.father = father;
		this.mother = mother;
	}
public String toString() {
	return "PersionClass [name=" + name + ", address=" + address + ", father=" + father + ", mother=" + mother + "]";
}
private String name;
private String address;
private String father;
private String mother;


public static void main(String[] args) {
	PersionClass p1=new PersionClass("abc","hfu","djf","ldk");
	PersionClass p2=new PersionClass("gjr","jif","jpdj","fkg");
	PersionClass p3=new PersionClass("djf","ldk","jpdj","fkg");
	System.out.println(p1.toString());
}
}