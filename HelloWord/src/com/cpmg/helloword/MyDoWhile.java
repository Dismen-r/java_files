package com.cpmg.helloword;

public class MyDoWhile {
	public static void main(String[] args) {
		int i=0;
		do{
			if(i==7) {
				i++;
				continue;
			}
			System.out.println(i+" helloWorld");
			i++;
		}while(i<10);
	}
}