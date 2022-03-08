package com.capgi.m1;
import java.util.*;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ex1 {
	
	public static void main(String[] args) {
		/*String str1=new String("hello");
		String str2="hello";
		
		if(str1==str2)
			System.out.println("equals");
		else
			System.out.println("not");
			*/
		
		//int[] arr=new int[5];
		//arr=new int[6];
		//System.out.println("not");
		
		/*short choice=100;
		switch(choice) {
		case 100:
			System.out.println("h");
			break;
		}
		*/
		Set set=new TreeSet();
		set.add("Priya");
		set.add("Ritu");
		
	//for(Object str:set) {
		//ystem.out.println(str);
	//}
	set.forEach(System.out::println);
		
	}
	
	

}
