package edu.jspiders.programming.pattern;

public class Pattern2 
{
	public static void main(String[] args) 
	{
		int num = 6 ;
		int sp = num - 1;
		for ( int i = 1 ; i<=num ; i++)
		{
			int j = 1;
			for( ; j<=sp ; j++)
				System.out.print("\t"+" ");
			for( ; j<=num ; j++)
				System.out.print("\t"+j);
			System.out.println();
			sp--;
		}
	}
}
