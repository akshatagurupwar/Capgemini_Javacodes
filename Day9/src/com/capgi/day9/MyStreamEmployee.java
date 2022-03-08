package com.capgi.day9;
import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class MyStreamEmployee {
	
	public static void main(String args[]) {
		
		
		List<MyEmployee> employeeList = new ArrayList<MyEmployee>();
		employeeList.add(new MyEmployee(10, "Ansar", 1000));
		employeeList.add(new MyEmployee(1, "Priya", 2000));
		employeeList.add(new MyEmployee(2, "Kumar", 8000));
		employeeList.add(new MyEmployee(100, "Anil", 10000));
		employeeList.add(new MyEmployee(5, "Zee", 20000));

		
		List<MyEmployee> filterlist=employeeList.stream().filter(e->e.getSalary()>5000).collect(Collectors.toList());
		filterlist.forEach(System.out::println);
        System.out.println("====================================================");

		filterlist.forEach(e->System.out.println(e.getName()));
        System.out.println("====================================================");

		
		List<String> maplist=employeeList.stream().map(e->e.getName().toUpperCase()).collect(Collectors.toList());

		maplist.forEach(System.out::println);
        System.out.println("====================================================");

		
		IntSummaryStatistics state=   employeeList.stream().mapToInt(e->e.getSalary()).summaryStatistics();
		
		
		System.out.println("Count "+state.getCount());

		System.out.println("Max "+state.getMax());

		System.out.println("Min "+state.getMin());

		System.out.println("Avg "+state.getAverage());
		
        System.out.println("====================================================");

		
		employeeList.stream().sorted(new EmployeeSortById()).forEach(System.out::println);

	}

}
