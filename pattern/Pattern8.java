package edu.jspiders.programming.pattern;

public class Pattern8 
{
	public static void main(String[] args) 
	{
			int num = 7 , st = 1;
			for(int i = 1 ; i<= num ; i++)
			{
				for(int j = 1 ; j<=st ; j++)
				{
					if(j == 1 || j == st)
					System.out.print("* ");
					else
						System.out.print("    ");
				}
					if(i <= num/2)	
						st++;
					else
						st--;
			System.out.println();
			}
	}
}
