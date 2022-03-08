package com.capgi.day9;
//Read the integer array
//find the maximun no
//find the min no
import java.util.Scanner;

class MyArray{
	public int minimum(Integer num[]) {
		int Min=num[0];
		for(int i=0;i<num.length;i++) {
	 		if(Min>num[i])
	 			Min=num[i];
		}
		return Min;

	}
	
	
	public int maximum(Integer num1[]) {
		int Max=num1[0];
		for(int i=0;i<num1.length;i++) {
			if(Max<num1[i])
				Max=num1[i];
		}
		return Max;

	}
}


public class Myclass {
	
	public static void main(String args[]) {
		MyArray m=new MyArray();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of array elements:");
		int n=sc.nextInt();
		Integer[] num= new Integer[n];
		System.out.println("Enter elements of array:");

		for(int i=0;i<n;i++) {
			num[i]=sc.nextInt();
		}
		System.out.println("Minimum value is:"+m.minimum(num));
		System.out.println("Miximum value is:"+m.maximum(num));
		sc.close();

	}

}
