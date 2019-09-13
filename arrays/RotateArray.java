package edu.jspiders.programming.arrays;

import java.util.Scanner;

public class RotateArray 
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
		 System.out.println("Enter the Rotation factor : ");
		 int rf = sc.nextInt();
		 for(int i = 1 ; i<= rf ; i++)
		 {
			 for(int j = 0 ; j<arr.length - 1 ; j++)
			 {
				 int temp = arr[j];
				 arr[j] = arr[j + 1];
				 arr[j + 1] = temp;
			 }
			 System.out.println("Rotated Elements Are : ");
			 for(int j = 0 ; j<arr.length ;j++)
			 {
				 System.out.println(arr[j] );
			 }
		 }
		 sc.close();
	 }
}
