package edu.jspiders.programming.recursion;

public class A 
{
static int length;
		public static void main(String[] args) 
		{
			 length = 5;
			printSeq(1);
		}
		public static void printSeq(int i)
		{
			if(i < length)
			{
				System.out.println(i);
				printSeq(i+1);
			}
			System.out.println(i);
		}
	}

