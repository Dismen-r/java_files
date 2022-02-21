package com.cpmg.day7;

import java.util.*;

public class MuCollection {
	public static void main(String args[]) {

		LinkedList<Integer> list = new LinkedList<Integer>();
		System.out.println(list.peek());
		System.out.println(list.pop());
		list.pollFirst();
		list.pollLast();
		list.poll();
		list.push(100);
		list.add(100);
		list.add(10);
		list.add(1);
		list.add(5);
		list.add(20);
		System.out.println(list.contains("Java"));
		System.out.println("Found " + list.get(0));
		System.out.println(list.indexOf("Java"));
		System.out.println(list.isEmpty());
		Iterator<Integer> it = list.iterator();
		while (it.hasNext()) {
			System.out.println("iterator " + it.next());
		}
		System.out.println("Removed value " + list.remove("Java"));
		System.out.println(list.size());
		Collections.sort(list);
		list.forEach(System.out::println);

	}
}
