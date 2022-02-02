package com.cpmg.day5;
//it cannot be extends
/*class String1 extends String
{
	
}
*/

//if you use the string without new keyword value are store in String Pool
//if used new then value will store in heap area

public class MyString {
	public static void main(String args[]) {
		// string variable
		// String value store in Heap
		// String value store in String Pool within the heap
		// class is class
		// String is Final Class Which cannot be extended
		// we will create object always and use it
		String str = " Hello String ";

		String str1 = new String();

		String str2 = new String("Hello String");
		// it will give the length of string
		System.out.println(str2.length());

		// it will check string contain some value or not
		// it will return true or false
		if (str2.isEmpty()) {
			System.out.println("String is empty");
		} else {
			System.out.println("String is not empty");
		}
		
		//charAt --it return the character a given location
	      System.out.println(str2.charAt(0));
	      
	      //codePointAt 
	      System.out.println(str2.codePointAt(0));
	      
	      //equals it is used to compare two String  
	      if(str.equals(str2))
	      {
	    	  System.out.println("Both are equal");
	      }
	      else
	      {
	    	  System.out.println("Both are not equal");
	      }
	      
	      //equalsIgnoreCase --true or false
	      if(str.equalsIgnoreCase(str2))
	      {
	    	  System.out.println("Both are equal");
	      }
	      else
	      {
	    	  System.out.println("Both are not equal");
	      }
	      
	      
	      //compareTo return integer value
	      String str4="a"; 
	      //if first is small or lower than second it return the difference with minus
	      //if first one is bigger than second it return the difference with positive 
	      //if first and second are equal then it return  the 0
	      //System.out.println(str4.compareTo(str5)); 
	      
	      
	      //compareToIgnoreCase 
	      //it will not consider the case 
	      //System.out.println(str4.compareToIgnoreCase(str5));
	      
	      //startsWith
	      //it is used to check string is start with particular value
	      System.out.println(str.startsWith("H"));
	      
	      //substring it is used to get the substring value
	      
	      //Hello World
	      
	      //llo World
	      //method overloading concept
	      System.out.println(str.substring(2));
	      System.out.println(str.substring(2,5));
	     // System.out.println(str.substring());
	      
	      System.out.println(str.concat(" H"));
	      
	      System.out.println(str.concat(" "+str2));
	      
	      //contains it will search for match string and return or false
	      System.out.println(str.contains("llo"));
	      System.out.println(str.contains("Java"));
	      
	      //toLowerCase
	      System.out.println(str.toLowerCase());
	      
	    //toUpperCase
	      System.out.println(str.toUpperCase());
	      
	      //trim remove the space
	      System.out.println(str.trim());
	      
	      String str6="Java";
	      String str7="Java";
	      String str8=new String("Java");
	      System.out.println(str6.hashCode());
	      System.out.println(str7.hashCode());
	      //System.out.println(str8.hashCode());
	       //address and value
	       if(str6==str8)
	      {
	    	  System.out.println("Equal");
	      }
	      else
	      {
	    	  System.out.println("Not equal");
	      }
	      
	      
	}

}