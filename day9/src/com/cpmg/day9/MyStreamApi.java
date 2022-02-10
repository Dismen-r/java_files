package com.cpmg.day9;

import java.util.*;
import java.util.stream.Collectors;

public class MyStreamApi {
	public static void main(String args[]) {
		List<Integer> l = new ArrayList<Integer>();
		l.add(5);
		l.add(6);
		l.add(7);
		l.add(-2);
		l.add(3);
		l.add(8);
		l.add(4);
		l.stream().filter(n -> n > 5).forEach(System.out::println);
		List<Integer> ls = l.stream().filter(n -> n > 0).collect(Collectors.toList());
		ls.forEach(System.out::println);
		l.stream().map(d -> d * d).forEach(System.err::println);
	}
}
