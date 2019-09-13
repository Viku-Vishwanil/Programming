package edu.jspiders.programming.recursion;

public class RecHello 
{
	static int length;
	public static void main(String[] args) 
	{
		int length = 8;
		printSeq(1);
	}
	public static void printSeq(int i)
	{
		if(i <= length)
		{
			System.out.println("Hello");
			printSeq(i+1);
		
		}
	}
}

