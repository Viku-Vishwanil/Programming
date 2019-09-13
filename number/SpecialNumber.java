package edu.jspiders.programming.number;

import java.util.Scanner;

public class SpecialNumber
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Number to find SpecialNumber");
		int num = s.nextInt();
		int sum = 0 ;
		
		int temp = num;
		//int fact = 1;
		while(num>0)
		{
			int rem = num % 10;
			int fact = 1;
				while(rem > 0)
				{
					fact = fact * rem;
					rem--;
				}
			 sum = sum + fact;
			 num = num / 10;
		}
		if(sum == temp) 
		{
		System.out.println("Special Number");
		}
		else
		{
			System.out.println("Not Special Number");
		}
	}
}
