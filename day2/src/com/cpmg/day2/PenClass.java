package com.cpmg.day2;

public class PenClass {
	public PenClass(int price, String name, String color) {
		
		this.price = price;
		this.name = name;
		this.color = color;
	}
	private int price;
	
	public String toString() {
		return "PenClass [price=" + price + ", name=" + name + ", color=" + color + "]";
	}
	private String name;
	private String color;

	public static void main(String[] args) {
		PenClass p1=new PenClass(35,"ballpoint","blue");
		PenClass p2=new PenClass(25,"sale","red");
		PenClass p3=new PenClass(45,"reynolds","green");
		System.out.println(p1.toString());
	}
}
