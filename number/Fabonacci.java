package edu.jspiders.programming.number;

import java.util.Scanner;

public class Fabonacci 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the Length to Print Fabonacci : ");
		int length = s.nextInt();
		
		int n1 = 0 , n2 = 1;
		
			if(length == 1)
				System.out.print(n1);
			else if(length == 2)
				System.out.print(n1+" "+n2);
			else
				System.out.print(n1+" "+n2+" ");
				for(int i = 3 ; i<=length; i++)
				{
					int n3 = n1 + n2;
					System.out.print(n3+" ");
					n1 = n2;
					n2 = n3;
				}
	}
}
