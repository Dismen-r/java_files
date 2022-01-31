package com.cpmg.day2;

public class Phone {
	@Override
	public String toString() {
		return "phone [price=" + price + ", brandname=" + brandname + ", color=" + color + ", storage=" + storage
				+ ", screenSize=" + screenSize + "]";
	}
	private int price;
	private String brandname;
	private String color; 
	private int storage;
	private float screenSize;
	Phone(int price, String brandname, String color, int storage, float screenSize)
	{
		this.price=price; 
		this.brandname=brandname;
		this.color=color;
		this.storage=storage;
		this.screenSize=screenSize;
	}
	public static void main(String[] args) {
		Phone p1=new Phone(234,"abc","hfu",123,67.0f);
		Phone p2=new Phone(235,"gjr","jif",456,32.2f);
		Phone p3=new Phone(345,"djf","ldk",789,45.0f);
		System.out.println(p1.toString());
	}

}
