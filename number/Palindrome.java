package edu.jspiders.programming.number;

import java.util.Scanner;

public class Palindrome 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Number to check palindrome : ");
		int num = s.nextInt();
		int temp = num;
		int res = 0;
		while(num>0)
		{
			int rem = num % 10;
			res = res * 10 + rem;
			num = num / 10;
		}
		if(res == temp)
		{
			System.out.println(temp +" is Palindrome");
		}
		else
		{
			System.out.println(temp +" is Not Palindrome");
		}
	}
}
