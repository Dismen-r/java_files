package com.cpmg.day6;
import java.util.*;
class OnlyPostiveNumberAllowed extends Exception {
	public OnlyPostiveNumberAllowed(String msg) {
		super(msg);
	}
}
public class MyException {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		if (number > 0) {
		} else {
			throw new OnlyPostiveNumberAllowed("Only Positive Number is allowed");
		}
	}
}