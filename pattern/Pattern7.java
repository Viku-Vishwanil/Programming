package edu.jspiders.programming.pattern;

public class Pattern7 
{
	public static void main(String[] args) 
	{
			int val = 0 , num = 7 , st = 1;
			for(int i = 1 ; i<= num ; i++)
			{
				for(int j = 1 ; j<=st ; j++)
				{
					System.out.print(" ");
				if(i <= num/2 + 1)
					System.out.print(++val);
				else
					System.out.print(--val);
				}
				System.out.println();	
			if(i <= num/2)	
				st++;
			else
				st--;
			}
			System.out.println();
	}
}
