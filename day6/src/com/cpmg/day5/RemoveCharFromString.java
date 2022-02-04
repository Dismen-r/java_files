package com.cpmg.day5;

public class RemoveCharFromString {
	public static void main(String args[]) {
		String a = "hello world ggggg";
		String b = "";
		int j=0;
		for (int i = 0; i < a.length(); i++) {
			if (a.charAt(i) == 'o') {
				b += a.substring(j, i);
				j=i+1;
			}
			if(i==a.length()-1) {
				b+=a.substring(j,i);
				
			}

		}
		System.out.println(b);
	}

}
