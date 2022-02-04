package com.cpmg.day5;
import java.util.Scanner;
public class CountCharInString {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		String a = "hello world ggggg";
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
