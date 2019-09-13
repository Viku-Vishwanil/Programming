package edu.jspiders.programming.pattern;

public class Pattern10 
{
	public static void main(String[] args) 
	{
			char ch1 = 'a' , ch2 = 'A'; 
			int num = 7 , st = 1;
			for(int i = 1 ; i<= num ; i++)
			{
				for(int j = 1 ; j<=st ; j++)
				{
					System.out.print("\t");
				if(i <= num/2 + 1)
				{
					System.out.print(ch1++);
								ch2++;
				}
				else				
					System.out.print(ch2++);
				}
				System.out.println("\t");	
			if(i <= num/2)	
				st++;
			else
				st--;
			}
			System.out.println("\t");
	}
}
