package edu.jspiders.programming.number;

import java.util.Scanner;

public class Factorial1 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Number to find factorial");
		int num = s.nextInt();
		int fact = 1 ;
		int temp = num;
		
		while(num>1)
		{
			fact = fact * num;
			num--;
		}
			System.out.println("Factorial of "+temp+" is "+fact);
	}
}
