package edu.jspiders.programming.pattern;

public class Pattern6 
{
	public static void main(String[] args) 
	{
		char ch1 = 'a' , ch2 = 'A' , ch3 = 'a';
		int num = 5 , sp = num -1;
		for(int i = 1 ; i <= num ; i++)
		{
			for(int j =1 ; j<=sp ; j++)
			System.out.print(" ");
			for(int j = 1 ; j<=i ; j++)
				if( i == 1 ||(i == num) && (j == 1|| j == num))
				{
					System.out.print(ch1++);
						ch2++;
				}
				else if(j == 1 || j == i )
					System.out.print(ch2++);
				else
					System.out.print(ch3++);
			
			System.out.println();
				sp--;
		}
	}
}
