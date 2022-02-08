package com.cpmg.day8;
import java.util.*;
public class MyMap {
public static void main(String args[]) {
	Map<Character, Integer> d=new HashMap<Character,Integer>();
	Scanner sc=new Scanner(System.in);
	String a=sc.nextLine();
	for(int i=0;i<a.length();i++)
		d.put(a.charAt(i), 0);
	for(int i=0;i<a.length();i++)
		d.put(a.charAt(i), d.get(a.charAt(i))+1);
	System.out.println(d);
}
}
