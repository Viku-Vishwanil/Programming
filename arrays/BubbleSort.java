package edu.jspiders.programming.arrays;

import java.util.Scanner;

public class BubbleSort 
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
		for(int i = 0 ; i<arr.length -1; i++) // Logic for Bubble Sort
		{
			for(int j= 0 ; j<arr.length -1-i; j++)
			{
				if(arr[j] > arr[j+1])
				{
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}		
		}
		System.out.println("Sorted Elements Are : ");
		for(int j = 0 ; j<arr.length; j++)
		{
			System.out.println(arr[j]);
		}
		sc.close();
	 }
}
