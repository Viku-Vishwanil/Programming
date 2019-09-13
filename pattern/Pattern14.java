package edu.jspiders.programming.pattern;

public class Pattern14 
{
	public static void main(String[] args) 
	{
			int num = 9 , st = num/2+1;
			for(int i = 1 ; i<= num ; i++)
			{
				for(int j = 1 ; j<=num/2+1 ; j++)
				{
					if((j == 1 || j == st) || ( (j == 1 || j == num/2+1) ||( i == 1 || i == num)))
					System.out.print("\t*");
					else
						System.out.print("\t ");
				}
					if(i <= num/2)	
						st--;
					else
						st++;
			System.out.println("\t");
			}
	}
}
