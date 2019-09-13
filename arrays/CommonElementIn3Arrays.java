package edu.jspiders.programming.arrays;

import java.util.Scanner;

public class CommonElementIn3Arrays 
{
	public static void main(String[] args) 
	{
			Scanner sc = new Scanner(System.in);
		 
		 System.out.println("Enter the Size of the first Array");
		 int [] a = new int[sc.nextInt()];
		 
		 System.out.println("Enter the values for the first Array ");
		for(int i = 0 ; i<a.length ; i++)
		 {
			 a[i] = sc.nextInt();
		 }
		 System.out.println("Enter the Size of the Second Array");
		 int [] b = new int[sc.nextInt()];
		 
		System.out.println("Enter the values for the Second Array ");
		for(int i = 0 ; i<b.length ; i++)
		 {
			 b[i] = sc.nextInt();
		 }
		System.out.println("Enter the Size of the Third Array");
		 int [] c = new int[sc.nextInt()];
		 
		 System.out.println("Enter the values for the Third Array ");
		for(int i = 0 ; i<c.length ; i++)
		 {
			 c[i] = sc.nextInt();
		 }
		System.out.println("Common Elements Are");
		for(int i = 0; i < a.length ; i++)
		{
			
			for(int j = 0 ; j<b.length ; j++)
			{
				if(a[i] == b[j])
				{
					for(int k = 0 ; k < c.length ; k++) 
					{
						if(b[j] == c[k])
						{
							System.out.println(c[k]);
						}
					}
				}
				
			}
		}
		sc.close();
	}
}
