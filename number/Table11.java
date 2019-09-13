package edu.jspiders.programming.number;

import java.util.Scanner;

public class Table11 
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter upper limit for table of 11");
		int up = s.nextInt();
		
		for(int i = 1; i <= up; i++)
		{
			System.out.println("11 * "+i+" = "+(11*i));
		}
		s.close();
	}
}
