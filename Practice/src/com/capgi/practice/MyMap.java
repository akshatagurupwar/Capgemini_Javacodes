package com.capgi.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Employee{
	int id;
	String name;
	int age;
	String gender;
	String department;
	int yearOfJoining;
	double salary;
	
	
	public Employee(int id,String name,int age,String gender,String department,int yearOfJoining,double salary) {
		this.id=id;
		this.name=name;
		this.age=age;
		this.gender=gender;
		this.department=department;
		this.yearOfJoining=yearOfJoining;
		this.salary=salary;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getGender() {
		return gender;
	}
	
	public String getDepartment() {
		return department;
	}
	
	public int getYearOfJoining() {
		return yearOfJoining;
	}
}
class implementation{
	public static Map<String,Long> getcountMaleFemale(List<Employee> list){
		
		Map<String,Long> map=list.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
		return map;
	}
	

}

public class MyMap {
	public static void main(String args[]) {
		implementation i=new implementation();
		List<Employee> list=new ArrayList<Employee>();
		list.add(new Employee(111,"Jiya",32,"Female","HR",2011,2500.0));
		list.add(new Employee(122,"Paul",25,"Male","Sales And Marketing",2015,13500.0));
		list.add(new Employee(133,"Martin",29,"Male","Infrastructure",2012,18000.0));
		
		System.out.println(i.getcountMaleFemale(list));
		
		list.stream().map(Employee::getDepartment).distinct().forEach(System.out::println);
		
		Map<String,Double> avgAge=list.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingInt(Employee::getAge)));
	}

}
