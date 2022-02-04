package com.cpmg.day7;
class person<A,B,C>{
	
	public person(A id, B name, C age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "person [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	private A id;
	private B name;
	private C age;
}
public class GenericClass {
	public static void main(String args[])
	{
		person<String,String,String> p1=new person<String,String,String>("jjjjhf","dismen","huj");
		System.out.println(p1.toString());
		
	}

}
