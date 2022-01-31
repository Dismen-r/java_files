package com.cpmg.helloword;

public class assignment3 {
	public static void main(String[] args) {
	//add two binary numbers
	long b1=0101,b2=0011;
	int[] s = new int[20];
	int i=0,r=0;
	while(b1 !=0 || b2!=0){
		s[i++]=(int)((b1%10+b2%10+r)%2);
		r=(int)((b1%10+b2%10+r)/2);
		b1=b1/10;
		b2=b2/10;
	}
	if(r!=0) {
		s[i++]=r;
	}
	i--;
	while(i>=0) {
		System.out.print(s[i--]);
	}
}
}