package com.capgi.day9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class MyStream {
	public static void main(String args[]) {
		
		List<Integer> ls=new ArrayList<Integer>();
		ls.add(8);
		ls.add(2);
		
		ls.add(4);

		ls.add(10);
		ls.add(30);
		ls.add(76);
		ls.add(76);
		ls.add(30);

        ls.stream().forEach(System.out::println);
        System.out.println("====================================================");
        
        List<Integer> filterList =ls.stream().filter(num->num>10).collect(Collectors.toList());
        filterList.forEach(System.out::println);
        System.out.println("====================================================");

        List<Integer> filterList1 =ls.stream().map(num->num*10).collect(Collectors.toList());

        filterList1.forEach(System.out::println);
        System.out.println("====================================================");

        System.out.println(ls.stream().count());
        System.out.println("====================================================");
        ls.stream().distinct().forEach(e->System.out.println(e));
        System.out.println("====================================================");
        ls.stream().sorted().forEach(e->System.out.println(e));
        System.out.println("====================================================");
        ls.stream().sorted(Collections.reverseOrder()).forEach(e->System.out.println(e));
        System.out.println("====================================================");

        System.out.println("Min "+ls.stream().max(Collections.reverseOrder()));
        System.out.println("Max "+ls.stream().min(Collections.reverseOrder()));
        System.out.println("====================================================");

        IntSummaryStatistics ls1= ls.stream().mapToInt(x->x).summaryStatistics();

        System.out.println("Count "+ls1.getCount());
        System.out.println(ls1.getAverage());
	}

}
