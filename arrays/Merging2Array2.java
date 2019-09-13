package edu.jspiders.programming.arrays;

import java.util.Scanner;

public class Merging2Array2 
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
		int [ ] res =new int[ arr.length + b.length]; // Logic for Merging two Arrays Method 1
		int i =0 ,j = 0 ,k = 0;
		for( ; k < res.length ;)
		{
			if(i < arr.length)
			{
				res[k++] = arr[i++];
			}
			if(j < b.length)
			{
				res[k++] = b[j++];
			}
		}
		System.out.println("Array Element after Merging");
		for(k = 0 ; k < res.length ; k++)
		{
			System.out.print(res[k]+" \t");
		}
		sc.close();
	}
}
