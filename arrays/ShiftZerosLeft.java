package edu.jspiders.programming.arrays;

import java.util.Scanner;

public class ShiftZerosLeft 
{
	public static void main(String[] args) 
	{
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("Enter the Size of the Array");
		 int [] arr = new int[sc.nextInt()];
		 
		 System.out.println("Enter the values for the Array");
		 	for(int i = 0 ; i<arr.length ; i++)
		 		arr[i] = sc.nextInt();
		 System.out.println("Array before Shifting : ");
		 for(int i = 0 ; i<arr.length ; i++)
		 {
			 System.out.println(arr[i]);
		 }
		 int count = 0;
		 for(int i = 0 ; i<arr.length ; i++)
		 {
			 if(arr[i] != 0)
			 {
				arr[count++] = arr[i];
			 }	 
		 }
		 while(count < arr.length)
			 arr[count++] =0;
		 System.out.println("Array after Shifting End : ");
		 for(int i = 0 ; i<arr.length ; i++)
		 {
			 System.out.println(arr[i]);
		 }	 
	}
}
