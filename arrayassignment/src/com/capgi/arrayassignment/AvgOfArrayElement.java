package com.capgi.arrayassignment;
////Avg of all the element of array
import java.util.Scanner;

public class AvgOfArrayElement {
	public static void main(String args[]) {
		int arr[]=new int[5];

		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<5;i++)
		{
	         System.out.println("Enter " +(i+1) +" Location" );

			arr[i]=sc.nextInt();

	    }
		int Avg=0;
		for(int i=0;i<5;i++)
		{
			Avg=Avg+arr[i];
		}
        System.out.println("Avg of array element is: "+(double)Avg/arr.length);
sc.close();
}


}
