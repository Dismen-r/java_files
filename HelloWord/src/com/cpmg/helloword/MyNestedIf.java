package com.cpmg.helloword;
import java.util.Scanner;
public class MyNestedIf {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
int a=s.nextInt();
int b=s.nextInt();
int c=s.nextInt();
if(a>b) {
	if(a>c) 
	System.out.println(a);
	}
else if(b>c)
	System.out.println(b);
else
	System.out.println(c);
}
}
