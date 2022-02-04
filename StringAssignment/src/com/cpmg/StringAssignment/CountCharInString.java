package com.cpmg.StringAssignment;
//write a program to count the occurrence of the given character in a string
import java.util.Scanner;
public class CountCharInString {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		String a = "hello world java";
		String b=s.next();
		int j=0;
		for (int i = 0; i < a.length(); i++) {
			if (a.charAt(i) == b.charAt(0)) {
				j++;
			}
		}
		System.out.println(j);
		s.close();
		
	}
}
