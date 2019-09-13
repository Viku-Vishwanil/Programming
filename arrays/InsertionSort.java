package edu.jspiders.programming.arrays;

import java.util.Scanner;

public class InsertionSort 
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
		 for(int i = 1 ; i < arr.length; i++) // Logic for Insertion Sort
		 {
			 int val = arr[i];
			 int j = i - 1 ;
			 while(j >= 0 && arr[j] > val)
			 {
				 arr[j + 1] = arr[j];
				 j--;
			 }
			 arr[j+1] = val;
		 }
		 System.out.println("Sorted Elements Are : ");
		 for(int i = 0 ; i<arr.length ; i++)
		 {
			 System.out.println(arr[i] );
		 }
		 sc.close();
	 }
}
