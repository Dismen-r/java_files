package com.cpmg.StringAssignment;
//write a program to check if two programs are anagrams of each other
import java.util.Arrays;
import java.util.Scanner;

public class CheckAnagrams {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		String a =s.next();
		String b =s.next();
		boolean c;
		if(a.length()==b.length()) {
			char[] d=a.toLowerCase().toCharArray();
			char[] e=b.toLowerCase().toCharArray();
			Arrays.sort(d);
			Arrays.sort(e);
			c=Arrays.equals(d,e);
		}
		else {
			c=false;
		}
		System.out.println(c);
}
}
