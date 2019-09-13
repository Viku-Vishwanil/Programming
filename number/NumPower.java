package edu.jspiders.programming.number;

import java.util.Scanner;

public class NumPower 
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = s.nextInt();
		
		System.out.println("Enter the power for the no.");
		int pow = s.nextInt();
		int res = 1;
		for(int i = 1; i<=pow; i++)
		{
			res = res * num;
		}
		System.out.println("Result = " +res);
	}
}
