package com.capgi.day4;

import java.util.Scanner;
//import java.util.Arrays;

public class SortingOfArrayElement {
	public static void main(String args[]) {
		int arr[]=new int[5];

		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<5;i++)
		{
	         System.out.println("Enter " +(i+1) +" Location" );

			arr[i]=sc.nextInt();

	    }
		
		for(int i=0;i<5;i++)
		{
			for(int j=i+1;j<5;j++)
			{
				int temp=0;
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		//We can also directly sort using this method
		//Arrays.sort(arr); 
        System.out.println("Sorted array elements are: ");
	
		for(int i=0;i<5;i++)
		{
         System.out.println(arr[i]);
	    }
sc.close();
		

	}
}
