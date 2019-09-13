package edu.jspiders.programming.number;

import java.util.Scanner;

public class OddSeries1 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter upper limit for odd no.s");
		int up = s.nextInt();
		int count = 1;
		for(int i = 1; count <= up; i++)
		{
			if(i % 2 != 0)
			{
				System.out.println(i);
				count++;
			}
		}
			s.close();
	}
}
