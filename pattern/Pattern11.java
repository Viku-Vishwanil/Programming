package edu.jspiders.programming.pattern;

public class Pattern11 
{
	public static void main(String[] args) 
	{
		char ch1 = 'a' , ch2 = 'A' ; //char ch1 = 'A' , ch2 = 'a' ;
			int num = 7 , st = 1;
			for(int i = 1 ; i<= num ; i++)
			{
				for(int j = 1 ; j<=st ; j++)
				{
					if(j == 1 || j == st)
					System.out.print("\t*");
					else 
					{
						if(i>num/2+1)	//if(i<=num/2+1)
						{
						System.out.print("\t"+ch2++);
						ch1++;
						}
						else
						{
							System.out.print("\t"+ch1++);
							ch2++;
						}
					}
				}
				
					if(i <= num/2)	
						st++;
					else
						st--;
			System.out.println("\t");
			}
	}
}
