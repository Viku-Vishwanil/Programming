package edu.jspiders.programming.number;

import java.util.Scanner;

public class Fabonacci1 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Length to Print last Fabonacci no : ");
		int length = s.nextInt();
		int n1 = 0 , n2 = 1;
		
			if(length == 1)
				System.out.print("Last fibonacii value in given length = "+n1);
			else if(length == 2)
				System.out.print("Last fibonacii value in given length = "+n2);
			else
			{
				
				int n3 = 0;
				for(int i = 3 ; i<=length; i++)
				{
					n3 = n1 + n2;
					n1 = n2;
					n2 = n3;
					
				}
			
				System.out.print("Last fibonacci value in given length = "+n3);
			}
	}
}
