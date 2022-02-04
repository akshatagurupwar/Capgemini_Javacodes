package com.capgi.day2;

class Student{
	
	static class Address
	{
		int houseNo;
		String streetName;
		
		public void print()
		{
			System.out.println("Nested class");
		}
	}
	
	static 
	{
		System.out.println("I am static");
	}
	
	public String toString()
	{
		return "Student [rollno="+rollno+" name="+name + " Scool name="+schoolName+ "]";
	}
	public Student(int rollno,String name)
	{
		this.rollno=rollno;
		this.name=name;
	}
	private int rollno;
	private String name;
	static String schoolName;
	public static void staticMethod()
	{
		System.out.println("schoolName "+schoolName);
	}
	
}

public class MyStatic {
 
	public static void main(String args[])
	{
		Student.schoolName="Abc";
		Student s1=new Student(101,"Akshata");
		Student s2=new Student(102,"Ram");
		System.out.println(s1);

		System.out.println(s2);
		Student.staticMethod();
		Student.Address address= new Student.Address();
		address.print();
	}
}
