package com.cpmg.helloword;

import java.util.Scanner;

public class simpleInterest {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("P");
		int a=s.nextInt();
		System.out.println("n");
		int b=s.nextInt();
		System.out.println("R");
		int c=s.nextInt();

		System.out.println((a*b*c)/100);
	}
}
