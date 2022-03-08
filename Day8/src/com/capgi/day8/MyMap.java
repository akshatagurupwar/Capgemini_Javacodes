package com.capgi.day8;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MyMap {
	public static void main(String args[]) {
		
		Map<Integer, String> map1=new HashMap<Integer, String>();
		map1.put(1001, "Akshata");
		map1.put(1002, "Ram");
		map1.put(1003, "Sita");
		map1.put(1004, "Gita");
		map1.put(1004, "Priya");
		map1.put(1005, "Sita");
        map1.put(null, null);
        map1.put(null, null);
        
		
		System.out.println(map1);		
		
		
		Map<Integer, Employee> map2=new HashMap<Integer, Employee>();
		map2.put(100,new Employee(3,"Akshata",6000f));
		map2.put(101,new Employee(9,"Ram",7000f));
		map2.put(102,new Employee(5,"Sita",8000f));
		map2.put(103,new Employee(7,"Gita",9000f));

		System.out.println(map2);	
		System.out.println(map1.get(1003));		


		Set<Integer> keys=map1.keySet();
		for(Integer key:keys)
		{		
			System.out.println(key);		

			
		}
		
	}

}
