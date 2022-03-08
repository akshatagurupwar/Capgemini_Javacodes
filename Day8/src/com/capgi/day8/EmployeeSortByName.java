package com.capgi.day8;

import java.util.Comparator;

public class EmployeeSortByName implements Comparator<Employee>{

	@Override
	public int compare(Employee e1, Employee e2) {
		return e1.getName().compareTo(e2.getName());
 
	}
	

}
 


