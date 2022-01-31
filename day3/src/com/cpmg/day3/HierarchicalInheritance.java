package com.cpmg.day3;
class Aa{
	public int a=30;
	public void printA() {
		System.out.println("Class A");
	}
}
class Bb extends Aa{
	public int b=20;
	public void printB() {
		System.out.println("Class B");
	}
}
class Cc extends Aa{
	public int c=20;
	public void printC() {
		System.out.println("Class C");
	}
}
public class HierarchicalInheritance {
	public static void main(String[] args) {
Bb b=new Bb();
b.printB();
b.printA();
System.out.println(b.a);
System.out.println(b.b);
	}
}
