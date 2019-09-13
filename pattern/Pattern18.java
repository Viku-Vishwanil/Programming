package edu.jspiders.programming.pattern;

public class Pattern18 
{
	public static void main(String[] args) 
	{
		int num = 7 , sp = num/2 , st = 1;
		char ch1 = 'a' , ch2 = 'A';
		for(int i = 1 ; i <= num ; i++)
		{
			for(int j = 1 ; j <= sp ; j++)
				System.out.print("\t");
			for(int j = 1 ; j <= st ; j++)
			{
				if(j == 1|| j == st)
					System.out.print("\t*");
				else	if(i <= num/2+1) 
					{
						System.out.print("\t"+ch1++);
						ch2++;
					}
					else
					{
						System.out.print("\t"+ch2++);					
					}
				
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
