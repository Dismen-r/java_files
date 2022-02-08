package com.cpmg.day7;

import java.util.*;

public class MyList {
	public static void main(String args[]) {
		List<String> l0 = new ArrayList<String>();
		List<String> l1 = new LinkedList<String>();
		List<String> l2 = new Stack<String>();
		List<String> l3 = new Vector<String>();
		l0.add("hello");
		l0.add("hi");
		l0.add("bye");
		l0.add("stack");
		l0.add("vector");
		l1.add("hello");
		l2.add("hi");
		l3.add("bye");
		l2.add("stack");
		l3.add("vector");
		System.out.println(l0);
		System.out.println(l1);
		System.out.println(l2);
		System.out.println(l3);
		System.out.println(l2);
	}
}
