package edu.jspiders.programming.pattern;

public class Pattern4 
{
	public static void main(String[] args) 
	{
		char ch1 = 'A' , ch2 = 'a';
		int num = 5 , sp = num -1;
		for(int i = 1 ; i <= num ; i++)
		{
			for(int j =1 ; j<=sp ; j++)
				System.out.print(" ");
			for(int j = 1 ; j<=i ; j++)
				if(j == 1 || j == i)
				{
					System.out.print(ch1++);
						ch2++;
				}
				else
				{
					System.out.print(ch2++);
						ch1++;
				}
			System.out.println();
				sp--;
		}
	}
}
