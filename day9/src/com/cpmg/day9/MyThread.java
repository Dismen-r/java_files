package com.cpmg.day9;
class Student{
	String name;
	int[] score;
	String Status;
	int a1;
	public Student(String name,int[] score) {
		this.name=name;
		this.score=score;
		this.a1=0;
		
	}
	public void setA(int a){
		this.a1=a;
	}
	public void setStatus(String s) {
		this.Status=s;
	}
}
class Validator{
	public String validateScore(Student s) throws Exception{
		int[] a=s.score;
		int sum=0;
		for(int i:a)
			sum+=i;
		if(sum/a.length>=0 && sum/a.length<=100) {
			s.setA(sum/a.length);
			return "Valid score";
		}
		else
			throw new InvalidScoreException("Invalid score");
	}
	public double getPercentage(Student s) {
		int a=s.a1;
		if(a>=33){
			s.setStatus("pass");
			return (double)a;
			}
		else {
			s.setStatus("fail");
			return 0.0;
		}
	}
}
class InvalidScoreException extends Exception{
	public InvalidScoreException(String s) {
		super(s);
	}
}

public class MyThread {
public static void main(String args[]) throws Exception{
	int score[]= {-1,-3,-3,-4};
	Student s= new Student("hello",score);
	Validator val=new Validator();
	String ans=val.validateScore(s);
	double per=val.getPercentage(s);
	System.out.println(ans+"\n"+per);
	
	
}
}
