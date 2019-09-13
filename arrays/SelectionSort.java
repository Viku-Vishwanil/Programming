package edu.jspiders.programming.arrays;

import java.util.Scanner;

public class SelectionSort 
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
					for(int i = 0 ; i<arr.length - 1; i++) // Logic for Selection Sort
						{
							int k = i;
							int j = i + 1;
							while(j < arr.length)
							{
								if(arr[k] > arr[j])
									k = j;
									j++;
							}
							int temp = arr[k];
							arr[k] = arr[i];
							arr[i] = temp;
						}
				System.out.println("Sorted Elements Are : ");
					for(int i = 0 ; i<arr.length ; i++)
					System.out.println(arr[i]);
				
			sc.close();
			 }
}
