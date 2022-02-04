package com.capgi.day5;

import java.io.File;
import java.io.FileInputStream;

//Serialization Interface

//Throwable

//Exception 


//Runtime Exception 




//Exception -it is error in java

//there are two type of error

//Syntax error
//it is identified by the compiler and code will not be compiled
//there is no solutions you have to correct it


//Logical error
//Logical error is called exception 

//1. Checked Exception --check at compile time and throw a error


//2. Unchecked Exception--which is not check at compile time 

//Each Exception have some name
//Exception will break the flow of program
//wrong input /output
//we can handle the exception using try catch block
//we can take the input again 
//or we can show proper message to user
//Whenever you some class Each class throw exception

//Exception Handling --
//try
//{
//it will look for exception
//}
//catch()
//{
//catch will handle the exception
//}

//try and catch block needs to use togather
public class MyException {
	
	public static void main(String args[])
	{
	
	
	try
		{
			
		//Checked Exception
		//Unhandled exception type FileNotFoundException
			//Compiler force to handle these Exception
		FileInputStream inputStream=new FileInputStream("c:\\file.txt");
			
			
		int a[]=new int[5];
		//ArrayIndexOutOfBoundsException
		//MyArray size of 5
		//I am trying to access the 7 location
		//a[7]=10;
			
		//Syntax error, insert ";" to complete BlockStatements
		//int a=10
		System.out.println("Hello first line");
		//Type mismatch: cannot convert from String to int
		//int a="hello";
		
		//No Syntax error is here
		//Exception Name: NullPointerException
		String str=null;
		System.out.println(str.substring(5));
		//break the flow because of exception
		System.out.println("Hello Java");
		}
		catch(Exception e)
		{
			//it will print the exception name
		e.printStackTrace();
		//it will print the exception name
		//System.out.println(e.getMessage());
		//System.out.println("Error in str . Please give some value");
		}
	}

}
