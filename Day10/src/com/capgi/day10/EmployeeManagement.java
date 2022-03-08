package com.capgi.day10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;





class Employee {
	private String name;
	private int iD;
	private int salary;
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}

	public void setiD(int iD) {
		this.iD = iD;
	}
	public int getiD() {
		return iD;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getSalary() {
		return salary;
	}
	Employee(){
		
	}
	
	Employee(String name, int iD, int salary) {
		super();
		this.name = name;
		this.iD = iD;
		this.salary = salary;
	}
	
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", iD=" + iD + ", salary=" + salary + "]";
	}
	public void createlist(ArrayList<Employee> emp) {

		System.out.println("Enter the Number of Employee you want to enter");
		Scanner sc=new Scanner(System.in);
		int size = sc.nextInt();
			for (int i = 0; i < size; i++) {
				
				System.out.println("Enter name Employee "+i);
				String name=sc.next();
				System.out.println("Enter Id Employee "+i);
				int id=sc.nextInt();
				System.out.println("Enter Salary Employee "+i);
				int salary=sc.nextInt();
                emp.add(new Employee(name,id,salary)); 

			}
	}
	
	
	public void displaylist(ArrayList<Employee> emp) {
		emp.forEach(System.out::println);

	}
	
	

}	
	
	


public class EmployeeManagement {
	public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	ArrayList<Employee> emp=new ArrayList<Employee>();
	Employee e=new Employee();

	while (true) {

		System.out.println("Enter 1 for create a List of employee");
		System.out.println("Enter 2 for Display a List of employee");
		System.out.println("Enter 3 for search employee");
		System.out.println("Enter 4 for delete a employee");
		System.out.println("Enter 6 Sort the Employee ASC BY Name");
		System.out.println("Enter 7 Sort the Employee ASC By Name");
		System.out.println("Enter 8 Sort the Employee ASC BY Salary");
		System.out.println("Enter 9 Sort the Employee ASC By Salary");
		System.out.println("Enter 10 Minimun paid salary employee");
		System.out.println("Enter 11 maximum salry of employee");
		System.out.println("Enter 12 Avg of employee Salary");
		System.out.println("Enter 13 Sum of employee Salary");
		
		System.out.println("enter 5 for exit");
		
		int choice = sc.nextInt();
		
		if(choice==1) {
			e.createlist(emp);
		}
		else if(choice==2) {
			e.displaylist(emp);
		}

	}
}
}
