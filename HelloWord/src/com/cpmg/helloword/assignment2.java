package com.cpmg.helloword;

public class assignment2 {
	public static void main(String[] args) {
		
		//even numbers from 1 to 100
		
		for(int i=0;i<101;i++) {
			if(i%2==0)
				System.out.println(i);
		}
		
		//odd numbers from 1 to 100
		for(int i=0;i<101;i++) {
			if(i%2!=0)
				System.out.println(i);
		}
		
		//average of three numbers
		int a=3,b=4,c=5;
		System.out.println((a+b+c)/3);
	}

}
