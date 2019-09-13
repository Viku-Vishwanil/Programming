package edu.jspiders.programming.arrays;

import java.util.Scanner;

public class InputFromUser 
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
	 System.out.println("Array Elements are");
	 for(int i = 0 ; i<arr.length ; i++)
	 {
		 System.out.println("arr["+i+"] = "+arr[i]);
	 }
	 sc.close();
 }
}
