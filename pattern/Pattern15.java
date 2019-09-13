package edu.jspiders.programming.pattern;

public class Pattern15 
{
	public static void main(String[] args) 
	{
		int num = 7, sp= num/2, st = 1;
		for(int i = 1; i<= num; i++)
		{
			for(int j = 1 ; j<=sp ; j++)
				System.out.print("\t ");
			for(int j = 1 ; j<=st ; j++)
			{
				if( j == 1 ||i == num/2+1 ||j== num/2+1||j==st)
					System.out.print("\t*");
				else
					System.out.print("\t");
			}
			System.out.println("\t");
				if(i<=num/2)
				{
					sp--;
					st++;
				}
				else
				{
					sp++;
					st--;
				}
		}
		
	}
}
