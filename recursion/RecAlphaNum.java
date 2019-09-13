package edu.jspiders.programming.recursion;

import java.util.Scanner;

public class RecAlphaNum 
{
	static int length, ch1=1;
	static char ch2 = 'A';
		public static void main(String[] args) {
			Scanner s = new Scanner(System.in);
			System.out.println("Enter the Length: ");
			length =s.nextInt();
			printSeq(1);
		}
		public static void printSeq(int val)
		{
			if(val <= length)
			{
				if(val % 2 != 0)
					System.out.println(ch1++);
				else
					System.out.println(ch2++);
				printSeq(val+1);
			}
		}
}
