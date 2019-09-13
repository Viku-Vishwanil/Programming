package edu.jspiders.programming.number;

public class ForPattern1 
{
	public static void main(String[] args)
	{
		for(int i = 1 ; i <= 20; i++)
		{
			if(i % 3 == 0)
			{
				if(i % 5 == 0)
				{
					System.out.println("AB");
				}
				else
				{
					System.out.println("A");
				}
			}
			else if(i % 5 == 0)
			{
				System.out.println("B");
			}
			else
				System.out.println(i);
		}
	}
}
