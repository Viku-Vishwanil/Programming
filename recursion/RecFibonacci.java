package edu.jspiders.programming.recursion;

import java.util.Scanner;

public class RecFibonacci 
{ 
	static int length;
	public static void main(String[] args) 
	{
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Length: ");
		length =s.nextInt();
		fibonacci(1);
	}
	public static void fibonacci(int n3)
	{
		int n1=0, n2=1;
		int i=1;
		if(length == 1)
			System.out.println(n1);
		else if(length==2)
			System.out.println(n1+" "+n2);
		else
		{
			if(i<=length)
			{
				System.out.println(n3);
				fibonacci( n1 + n2);
			}
		}
		
	}
}
