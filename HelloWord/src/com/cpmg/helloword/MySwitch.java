package com.cpmg.helloword;

public class MySwitch {
	public static void main(String args[]) {
		int a=3;
		switch(a) {
		case 1:
			System.out.println("mon");
			break;
		case 2:
			System.out.println("tue");
			break;
		case 3:
			System.out.println("wed");
			break;
		default:
			System.out.println("unknown");
			break;
		}
	}
}
