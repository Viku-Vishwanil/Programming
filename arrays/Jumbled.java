package edu.jspiders.programming.arrays;

import java.util.Scanner;

public class Jumbled 
{
	public static void main(String[] args) 
	 {
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("Enter the Number");
		 int num =sc.nextInt() ;
		 int temp = num , count = 0;
		 while(num > 0)
		 {
			 num = num / 10;
			 count++;
		 }
		 int [] arr = new int [count];
		 num = temp;
		
		 for(int i = 0 ; i<arr.length ; i++) // Logic for Jumbled Number
		 {
			 int rem = num % 10 ;
			 num = num / 10 ;
		 }
		 int jumbledCount =0 ;
		 for(int i = 0 ; i<arr.length  - 1; i++)
		 {
			 if(arr[i] - arr[i+1] == 1 ||arr[i] - arr[i+1] == -1 )
				 jumbledCount = 0;
			 else
				 break;
		 }
		 if(jumbledCount + 1 == count)
		 {
			 System.out.println("Number is Jumble");
		 }
		 else
		 {
			 System.out.println("Number is not Jumble");
		 }
		 sc.close();
			 
	 }
}
