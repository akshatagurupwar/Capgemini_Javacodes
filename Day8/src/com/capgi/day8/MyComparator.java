package com.capgi.day8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class MyComparator  {

	public static void main(String args[]) {
		List<Employee> ls=new ArrayList<Employee>();
		ls.add(new Employee(10, "Ansar", 100.0f));
		ls.add(new Employee(1, "Priya", 100.0f));
		ls.add(new Employee(2, "Kumar", 100.0f));
		ls.add(new Employee(100, "Anil", 100.0f));
		ls.add(new Employee(5, "Zee", 100.0f));

		
		Collections.sort(ls,new EmployeeSortById());
		ls.forEach(System.out::println);
		
		System.out.println("==================================================================");
		Collections.sort(ls,new EmployeeSortByName());

		ls.forEach(System.out::println);
		System.out.println("==================================================================");

		Set<Employee> st=new TreeSet<Employee>(new EmployeeSortById());
		st.add(new Employee(10, "Ansar", 100.0f));
		st.add(new Employee(1, "Priya", 100.0f));
		st.add(new Employee(2, "Kumar", 100.0f));
		st.add(new Employee(100, "Anil", 100.0f));
		st.add(new Employee(5, "Zee", 100.0f));
		st.forEach(System.out::println);

	}
	
	
}
