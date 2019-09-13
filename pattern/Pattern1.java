package edu.jspiders.programming.pattern;

public class Pattern1 
{
	public static void main(String[] args) 
	{
		int num = 5 ;
		int sp = num - 1;
		for ( int i = 1 ; i<=num ; i++)
		{
			for(int j = 1 ; j<=sp ; j++)
				System.out.print("\t"+"  ");
			for(int j = 1 ; j<=i ; j++)
				System.out.print("\t"+j);
			System.out.println();
			sp--;
		}
	}
}
