package com.module1;
import java.util.*;
import java.util.stream.Collectors;
class examp{
	int a;
	String b;
	public examp(int a,String b) {
		this.a=a;
		this.b=b;
	}
}
public class StreamApi {
	public static void main(String args[]) {
		//with premitive datatype
		List<Integer> l = new ArrayList<Integer>();
		l.add(5);
		l.add(6);
		l.add(7);
		l.add(-2);
		l.add(3);
		l.add(8);
		l.add(4);
		//filter
		List<Integer> ls = l.stream().filter(n -> n > 0).collect(Collectors.toList());
		ls.forEach(System.out::println);
		//map or change/convert
		List<Integer> ls1 =ls.stream().map(d -> d * d).collect(Collectors.toList());
		ls1.forEach(System.err::println);
		
		
		//with Object
		List<examp> lo = new ArrayList<>();
		examp a=new examp(5,"5");
		lo.add(a);
		lo.add(new examp(4,"4"));
		lo.add(new examp(2,"2"));
		lo.add(new examp(9,"9"));
		lo.add(new examp(7,"7"));
		//filter
		List<examp> l1=lo.stream().filter(n->n.a>5).collect(Collectors.toList());
		for(int i=0;i<l1.size();i++) {
			System.out.println(l1.get(i).b);
		}
		//map
		Map<Integer,String> m=lo.stream().collect(Collectors.toMap(x->x.a,x->x.b));
		System.err.println(m);
		
	}
}
