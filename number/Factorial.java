package edu.jspiders.programming.number;

import java.util.Scanner;

public class Factorial 
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter upper limit to find factorial");
		int up = s.nextInt();
		int f = 1;
		for(int i = 1; i <= up; i++)
		{
			f = i * f;
			System.out.print(i +" * ");
		}
			System.out.println(" = "+f);
			
			s.close();
	}
}
