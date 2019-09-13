package edu.jspiders.programming.arrays;

import java.util.Scanner;

public class Test
{
	public static void main(String[] args) 
	 {
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("Enter the Size of the Array");
		 int [] arr = new int[sc.nextInt()];
		 
		 System.out.println("Enter the values for the Array");
		 for(int i = 0 ; i<arr.length ; i++)
		 {
		 System.out.println("Enter the  value at"+i+"Position");
			 arr[i] = sc.nextInt();
		 }
		 /*System.out.println("Array Elements are");
		 for(int i = 0 ; i<arr.length ; i++)
		 {
			 System.out.println("arr["+i+"] = "+arr[i]);
		 }*/
		 for(int i = 0 ; i<arr.length ; i++)
		 {
			 int count = 0;
			 for(int j = 0 ; i<arr.length ; j++)
			 {
				 if(i!=j && arr[i] == arr[j] && i>j)
					 break;
				 else if(i!=j && arr[i] == arr[j] )
				 {
					 count++;
					 break;
				 }
			 }
			 if(count != 0)
				 System.out.println(arr[i]);
		 }
		 sc.close();
	 }

}
