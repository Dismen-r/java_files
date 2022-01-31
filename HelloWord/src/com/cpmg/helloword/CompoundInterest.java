package com.cpmg.helloword;

import java.util.Scanner;
import java.lang.Math;
public class CompoundInterest {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("P");
		int a=s.nextInt();
		System.out.println("n");
		int b=s.nextInt();
		System.out.println("R");
		int c=s.nextInt();
		System.out.println("t");
		int d=s.nextInt();
		System.out.println(a*Math.pow((int)(1+c/b),(int)(b*d)));
	}

}
