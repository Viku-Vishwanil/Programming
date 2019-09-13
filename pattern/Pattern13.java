package edu.jspiders.programming.pattern;

public class Pattern13 
{
	public static void main(String[] args) 
	{
		char ch1 ='A' , ch2 = 'a';
		int num = 7 ,sp = num/2 , st=1;
		for(int i = 1 ; i <= num ; i++)
		{
			for(int j = 1 ; j <= sp ; j++)
				System.out.print(" ");
			for(int j = 1 ; j <= st ; j++)
			{
					if(i == 1 ||( i ==num/2+1) && (j == 1) || i == num)
								System.out.print("*");
					else
					{
							if(i <= num/2 + 1)
							{
								if(j == 1)
								{
									System.out.print(ch2++);
									ch1++;
								}
								else if (j == st)
								{
									System.out.print(ch1++);
									ch2++;
								}
								else
								{
									System.out.print(" ");
								}
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
