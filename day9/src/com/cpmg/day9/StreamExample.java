package com.cpmg.day9;

import java.util.ArrayList;
import java.util.List;

public class StreamExample {
	public static void main(String args[]) {
		List<String> l = new ArrayList<String>();
		l.add("hello world");
		l.add("hai");
		l.add("good morning");
		l.add("bye");
		l.add("hi");
		l.stream().filter(n -> n.charAt(0)=='h').forEach(System.out::println);
	}
}