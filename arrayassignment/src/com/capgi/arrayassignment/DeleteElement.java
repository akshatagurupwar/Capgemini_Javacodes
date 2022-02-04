package com.capgi.arrayassignment;

import java.util.Scanner;
//delete a element in array


public class DeleteElement {
	public static void main(String args[]) {
		int arr[]=new int[5];
		int pos=0;

		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<5;i++)
		{
	         System.out.println("Enter " +(i+1) +" Location" );

			arr[i]=sc.nextInt();

	    }
        System.out.println("Enter element which you want to delete" );

		int element=sc.nextInt();
		for(int i=0;i<arr.length;i++) {
			if(element==arr[i]) {
				 pos=i;
			}
		}
		for(int i=pos;i<4;i++)
		{
		arr[i]=arr[i+1];
		}

		
		for(int i=0;i<arr.length-1;i++)
		{
	         System.out.println(arr[i]);


	    }
		sc.close();

		
	}

}
