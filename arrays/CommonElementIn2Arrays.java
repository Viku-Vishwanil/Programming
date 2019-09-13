package edu.jspiders.programming.arrays;

import java.util.Scanner;

public class CommonElementIn2Arrays 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		 
		 System.out.println("Enter the Size of the first Array");
		 int [] arr = new int[sc.nextInt()];
		 
		 System.out.println("Enter the values for the first Array ");
		for(int i = 0 ; i<arr.length ; i++)
		 {
			 arr[i] = sc.nextInt();
		 }
		 System.out.println("Enter the Size of the Second Array");
		 int [] b = new int[sc.nextInt()];
		 
		System.out.println("Enter the values for the Second Array ");
		for(int i = 0 ; i<b.length ; i++)
		 {
			 b[i] = sc.nextInt();
		 }
		System.out.println("Common Elements Are");
		for(int i = 0; i < arr.length ; i++)
		{
			for(int j = 0 ; j<b.length ; j++)
			{
				if(arr[i] == b[j])
				{
					System.out.println(arr[i]);
				}
				
			}
		}
		sc.close();
	}
}
