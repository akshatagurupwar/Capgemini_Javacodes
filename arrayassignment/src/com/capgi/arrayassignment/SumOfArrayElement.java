package com.capgi.arrayassignment;
//sum of all the element of array

import java.util.Scanner;

public class SumOfArrayElement {
	public static void main(String args[]) {
		int arr[]=new int[5];

		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<5;i++)
		{
	         System.out.println("Enter " +(i+1) +" Location" );

			arr[i]=sc.nextInt();

	    }
		int sum=0;
		for(int i=0;i<5;i++)
		{
			sum=sum+arr[i];
		}
        System.out.println("Sum of array element is: "+sum);
        sc.close();
	}

}
