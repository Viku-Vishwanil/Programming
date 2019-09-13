package edu.jspiders.programming.pattern;

public class Pattern5 
{
	public static void main(String[] args) 
	{
		char ch2 = 'A';
		int num = 5 , sp = num -1 , ch1 = 1 , val = 1;
		for(int i = 1 ; i <= num ; i++)
		{
			for(int j =1 ; j<=sp ; j++)
				System.out.print(" ");
			for(int j = 1 ; j<=i ; j++)
				if(val++ % 2 != 0)
				{
					System.out.print(ch1++);						
				}
				else
				{
					System.out.print(ch2++);
				}
			System.out.println();
				sp--;
		}
	}
}
