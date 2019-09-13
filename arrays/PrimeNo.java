package edu.jspiders.programming.arrays;

import java.util.Scanner;

public class PrimeNo 
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
		 System.out.println("Prime numbers are : ");
			 for(int i = 0 ; i<arr.length ; i++)
			 {
					 int count = 0;
					 for(int j = 2 ; j<arr[i]/*arr.length*/ ; j++)
					 if( arr[i] % j == 0 )/*if(i!=j && arr[i]==arr[j])*/
					 {
						  count++;
						  break;
					 }
					 if(count == 0)
					 {
						 System.out.println(arr[i]);
					 }
			 }
			 sc.close();
	 }
}
