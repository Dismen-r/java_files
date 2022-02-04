package com.cpmg.StringAssignment;
//write a program to reverse the words from the given string sentence
public class ReverseWordsFromSentence {
	public static void main(String args[]) {
		String a = "hello world ggggg";
		String b = "";
		int j=0;
		for (int i = 0; i < a.length(); i++) {
			if (a.charAt(i) == ' ') {
				b = a.substring(j, i) +" "+ b;
				j=i+1;
			}
			if(i==a.length()-1) {
				b=a.substring(j,i)+" "+b;
				
			}

		}
		System.out.println(b);
	}
}
