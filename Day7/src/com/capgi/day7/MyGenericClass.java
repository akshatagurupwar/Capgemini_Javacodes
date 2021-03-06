package com.capgi.day7;

class Person<T,V,Z>{
	private T Id;
	private V Name;
	private Z Salary;
	
	
	Person(T Id,V Name,Z Salary){
		this.Id=Id;
		this.Name=Name;
		this.Salary=Salary;
		
	}
	
	public void printPerson() {
		System.out.println("Id "+this.Id);
		System.out.println("Name "+this.Name);
		System.out.println("Salary "+this.Salary);

	}
}

public class MyGenericClass {
	public static void main(String args[]) {
		
		//wrapper class
		//It will not take primitive type
		Person<Integer,String,Double> p1=new Person<Integer,String,Double>(101,"Akshata",10.00);
		p1.printPerson();
		
	}

}
