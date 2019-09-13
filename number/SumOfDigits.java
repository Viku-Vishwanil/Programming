package edu.jspiders.programming.number;

import java.util.Scanner;

public class SumOfDigits 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Number to find SumOfDigits");
		int num = s.nextInt();
		int sum = 0 ;
		int temp = num;
		
		while(num>0)
		{
			int rem = num % 10;
			 sum = sum + rem;
			 num = num / 10;
		}
		System.out.println("Sum of Digits "+temp+" is "+sum);
      }
}
