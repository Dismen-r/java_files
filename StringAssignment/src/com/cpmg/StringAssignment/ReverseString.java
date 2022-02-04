package com.cpmg.StringAssignment;
//write a program to reverse a string in java without using the reverse method
import java.util.Scanner;

public class ReverseString {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		String a =s.next();
		String b="";
		for (int i = a.length()-1; i>=0 ; i--) {
			b+=a.charAt(i);
		}
		System.out.println(b);
		s.close();
		
	}
}
