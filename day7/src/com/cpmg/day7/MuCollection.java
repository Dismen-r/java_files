package com.cpmg.day7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

//Import java.util.ArrayList
//ArrayList Internally use the Array as data structure 



//Collection In Java

//Collection is set of different implementation  
//array
//stack
//Linked List
//Queue
//Store the data in collection 
//easy to insert , update ,delete and sort and others operations
//min, max

//collection is interface 
//SET 
//LIST 

public class MuCollection {
	public static void main(String args[])
	{
		
		//created the ArrayList with String type
		//Add the value(Insert Operation
		//Print the value ()
		
		
		//creating the object of Array List
		//Constructs an empty list with an initial capacity of ten.
		LinkedList<Integer> list=new  LinkedList<Integer>();
        //add method is used to add the data
		
		
		//after converting the list to generic it only holds the given type
		//Looks at the object at the top of this stack without removing it from the stack.
		System.out.println(list.peek());
		
		//Removes the object at the top of this stack and returns that object as the value of this function.
		System.out.println(list.pop());
		
		//Retrieves and removes the first element of this list,or returns null if this list is empty.
		list.pollFirst();
		
		//Retrieves and removes the last element of this list,or returns null if this list is empty.
		list.pollLast();
		
		//Retrieves and removes the head (first element) of this list.
		list.poll();
		
		
		//insert new value to stack
		list.push(100);
		
		list.add(100);
		list.add(10);
		list.add(1);
		list.add(5);
		list.add(20);
		//delete all the element of list
		//list.clear();
		
		//search for given value if 
		//it is there return true else false
		System.out.println(list.contains("Java1"));
		
		//it will return the value using index
		System.out.println("Found "+list.get(0));
		
		
		//indexOf
		//it take value as input
		//it return the index value if found
		//if given value is not found return -1
		System.out.println(list.indexOf("Java1"));
		
		
		//isEmpty
		//it will return true is list is empty
		//it will return false if list is not empty
		
		System.out.println(list.isEmpty());
		
		//iterator
		//print or modify all the value
		//list.iterator()  --which will return iterator for list
		Iterator<Integer> it= list.iterator();
		//hasNext() 
		//return true if there is next value 
		//false if there is no value
		while(it.hasNext())
		{
			//next()
			//return the current value
			//it.
			System.out.println("iterator "+it.next());
		}
		//remove(index)
		//you can remove by index value
		//return the String which is going to removed
		//if index not found OutOFBondException
		
		//delete operation on List(Array)
		//remove(value)
		//return true ;if found and removed
		//false --it not found or not removed
		System.out.println("Removed value "+list.remove("Java1"));
		
		//size()
		//return the size of list
		System.out.println(list.size());
		
		//sort()
		//ASC
		//DESC second paramters as Collections.reverseOrder()
		Collections.sort(list);
		
		
		
		//print the value
		//Java 1.8 
		//lamda expression
		
		list.forEach(System.out::println);
		
		//list.forEach(e->System.out.println(e));
		
	   //direclty with to string 
		//System.out.println(list);
		
		//list is advance for loop
		//for 
		//data type :
		//variable name
		//:
		//array or list o collection
		/*
		 * for(String str:list) { System.out.println(" "+str); }
		 */
	}
}
