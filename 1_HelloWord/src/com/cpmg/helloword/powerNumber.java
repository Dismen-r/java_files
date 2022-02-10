package com.cpmg.helloword;
import java.util.Scanner;
import java.lang.Math;

public class powerNumber {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("n");
		int a=s.nextInt();
		System.out.println("P");
		int b=s.nextInt();
		System.out.println(Math.pow(a,b));
	}

}
