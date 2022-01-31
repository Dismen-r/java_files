package com.cpmg.day3;
class A1{
	public int a=30;
	public void printA1() {
		System.out.println("Class A");
	}
}
class B1 extends A1{
	public int b=20;
	public void printB1() {
		System.out.println("Class B");
	}
}
class C1 extends B1{
	public int c=20;
	public void printC1() {
		System.out.println("Class C");
	}
}
public class MultilevelInheritance {
	public static void main(String[] args) {
		C1 c=new C1();
		c.printB1();
		c.printA1();
		System.out.println(c.a);
		System.out.println(c.b);
	}
}
