package edu.jspiders.programming.arrays;

import java.util.Scanner;

public class DiffNumber 
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
		System.out.println("Elements Are : ");
		for(int i = 0 ; i<arr.length; i++)
		{
			for(int j= 0 ; j<arr.length; j++)
			{
				int diff = arr[i] - arr[j];
				if(diff == 1 || diff == -1)
				{
					System.out.print("{"+arr[j]+","+arr[i]+"}");
				}
			}		
			System.out.print("\t");
		}	
		sc.close();
	 }
}
