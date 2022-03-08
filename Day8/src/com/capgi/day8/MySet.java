package com.capgi.day8;

import java.util.*;

class Employee 
{
 public Employee(int id, String name, float salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
private int id;
 private String name;
 private float salary;
	
}



public class MySet {
	public static void main(String args[]) {
		
		Set<Integer> s=new HashSet<Integer>();
		s.add(10);
		s.add(23);
		s.add(87);
		s.add(45);
		s.add(90);
		s.add(1);
		
		
        //Clear the element
		//s.clear();

		s.contains(10);
        Object array=(Object)s.toArray();
        
		Set st = new LinkedHashSet();
		st.add(4);
		st.add(10);
		st.add(1);
		st.add(4);
		st.add(100);

		Set sortedSet = new TreeSet();
		sortedSet.add(4);
		sortedSet.add(10);
		sortedSet.add(1);
		sortedSet.add(4);
		sortedSet.add(100);

		System.out.println("HashSet " + s);
		System.out.println("LinkedHashSet " + st);

		System.out.println("TreeSet " + sortedSet);

		
		List<Employee> employeeList=new ArrayList<Employee>();
		employeeList.add(new Employee(10, "Ansar", 100.0f));
		employeeList.add(new Employee(1, "Priya", 100.0f));
		employeeList.add(new Employee(2, "Kumar", 100.0f));
		employeeList.add(new Employee(100, "Anil", 100.0f));
		employeeList.add(new Employee(5, "Zee", 100.0f));
		
		employeeList.forEach(System.out::println);
		
		
		Set<Employee> employeeSet=new LinkedHashSet<Employee>();
		employeeList.add(new Employee(10, "Ansar", 100.0f));
		employeeList.add(new Employee(1, "Priya", 100.0f));
		employeeList.add(new Employee(2, "Kumar", 100.0f));
		employeeList.add(new Employee(100, "Anil", 100.0f));
		employeeList.add(new Employee(5, "Zee", 100.0f));
		employeeList.add(new Employee(100, "Anil", 100.0f));
		employeeList.add(new Employee(5, "Zee", 100.0f));
		
		employeeList.forEach(System.err::println);


	}
}
