package com.cpmg.day3;
class A{
	public int a=30;
	public void printA() {
		System.out.println("Class A");
	}
}
class B extends A{
	public int b=20;
	public void printB() {
		System.out.println("Class B");
	}
	
	
}
public class SingleInheritance {
	public static void main(String[] args) {
B b=new B();
b.printB();
b.printA();
System.out.println(b.a);
System.out.println(b.b);
	}
}
