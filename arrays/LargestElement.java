package edu.jspiders.programming.arrays;

import java.util.Scanner;

public class LargestElement 
{
	public static void main(String[] args) 
	 {
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("Enter the Size of the Array");
		 int [] arr = new int[sc.nextInt()];
		 
		 System.out.println("Enter the values for the Array");
		 for(int i = 0 ; i<arr.length ; i++)
		 {
			 arr[i] = sc.nextInt();
		 }
		 int largest = arr[0]; // Logic for Largest Element
		 for(int i = 1 ; i<arr.length ; i++)
		 {
			 if(arr[i] > largest)
			 {
				 largest = arr[i];
			 }
		 }
		 System.out.println("Largest Element is : "+largest);
		 		sc.close();
	 }
}
