package edu.jspiders.programming.number;

import java.util.Scanner;

public class Armstrom 
{
	public static void main(String[] args)
 	{
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter Number to check Arm : ");
		int num = s.nextInt();
		
		int temp = num ;
		int count = 0, sum= 0;
	 
			while(num > 0)
			{
				num = num / 10;
				count++;
			}
			num = temp;
			while(num > 0)
			{
				int rem = num % 10;
				int prod = 1;
					for(int i = 1; i<=count;i++)
						prod = prod*rem;
						sum= sum + prod;
						num = num/10;
			}
			if(temp==sum)
			{
				System.out.println("Number is Arm");
			}
			else
			{
				System.out.println("Number is not Arm");
			}
 	}
}
