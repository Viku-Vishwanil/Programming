package edu.jspiders.programming.arrays;

import java.util.Scanner;

public class SmallerPrint 
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
		 System.out.println("Enter the element to find Smaller");
		 int ch = sc.nextInt();
		 System.out.println("Smaller Elements Are");
		 for(int i = 0 ; i<arr.length ; i++)
		 {
			 if(arr[i] < ch)
			 {
				 System.out.println(arr[i]);
			 }
		 }
		 sc.close();
	 }
}
