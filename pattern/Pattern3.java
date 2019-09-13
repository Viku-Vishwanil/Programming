package edu.jspiders.programming.pattern;

public class Pattern3 
{
	public static void main(String[] args) 
	{
		char ch1 = 'A' , ch2 = 'a';
		int ch3 = 1;
		int num = 5;
		int sp = num - 1;
		for(int i = 1 ; i<=num ; i++)
		{
			for(int j = 1 ; j<=sp ; j++)
				System.out.print("\t"+" ");
			for(int j = 1 ; j<=i ; j++)
				if(i == 1 || (i == num) && (j==1 || j==num))
				{
					System.out.print("\t"+"*");
				}
				else if(j == 1)
				{
					System.out.print("\t"+ch1++);
						ch2++;
				}
				else if(j == i)
				{
					System.out.print("\t"+ch2++);
						ch1++;
				}
				else
				{
					System.out.print("\t"+ch3++);
				}
			System.out.println("\t");
				sp--;
		}
	}
}
