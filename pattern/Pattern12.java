package edu.jspiders.programming.pattern;

public class Pattern12 
{
	public static void main(String[] args) 
	{
			char ch1 = 'A' , ch2 = 'a'; 
			int num = 7 , st = 1, sp = num/2 , val = 1;
			for(int i = 1 ; i<= num ; i++)
			{
				for(int j = 1 ; j<=sp ; j++)
					System.out.print(" ");
				for(int j = 1 ; j<=st ; j++)
				{
					if(i <= num/2+1 )
					{
						if (val++ % 2 != 0)
							{
								System.out.print(ch2++);
									ch1++;
							}
						else	
							{
							System.out.print(ch1++);
							ch2++;
							}
					}
				else
				{
					if(val++ % 2 == 0)
					{
						System.out.print(ch1++);
							ch2++;
					}
					else
					{
						System.out.print(ch2++);
						ch1++;
					}
				}
		}	
			if(i<= num/2+1)	
			{
				st++;
				sp--;
			}
			else
			{
				st--;
				sp++;
			}
			System.out.println();
			}
	}
}
