package edu.jspiders.programming.recursion;

import java.util.Scanner;

public class Num1To10 
{
	static int length;
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Length: ");
		length =s.nextInt();
		printSeq(1);
	}
	public static void printSeq(int i) 
	{
		if(i<=length)
		{
			System.out.println(i);
			printSeq(i+1);
		}
		
	}
}
