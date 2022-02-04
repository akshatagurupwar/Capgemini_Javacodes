package com.capgi.day5;

public class MyInteger {

	public static void main(String args[])
	{
		 Integer a = new Integer(55);
		 
		 //it is an inbuilt method used to return string object representing the 
		 //specified integer in the method argument
		 
		 System.out.println("toString(x) = " + Integer.toString(a));
		 System.out.println("toHexString(x) =" + Integer.toHexString(a));
		 System.out.println("toOctalString(x) =" + Integer.toOctalString(a));
		 
		 
		 //valueof() method returns the relevant Integer Object holding the value of the argument passed.
		 Integer z = Integer.valueOf(a);

		 System.out.println("valueOf(x) = " + z);


	}
}
