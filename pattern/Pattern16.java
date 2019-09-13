package edu.jspiders.programming.pattern;

public class Pattern16 
{
	public static void main(String[] args) 
	{
		int num = 7 , sp = num/2 , st = 1;
		for(int i = 1 ; i <= num ; i++)
		{
			for(int j = 1 ; j <= sp ; j++)
				System.out.print("\t");
			for(int j = 1 ; j <= st ; j++)
			{
				if(j == 1|| j == st)
					System.out.print("\t*");
				else
					System.out.print("\t");	
			}
			if(i <= num/2) 
			{
				st = st + 2 ;
				sp--;
			}
			else
			{
				st = st - 2 ;
				sp++;
			}
			System.out.println("\t");
		}
	}
}
