package edu.jspiders.programming.strings;

import java.util.Scanner;

public class FindSubStr 
{
	public static void main(String[] args)
	{
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("Enter the First String : "); 
		 String s1 =sc.nextLine(); 											// hello welcome to jspiders
		 
		 System.out.println("Enter the Second String : "); 
		 String s2 =sc.nextLine(); 										// welcome //Qspiders							
		 
		 char[] ch1 =s1.toCharArray();
		 char[] ch2 =s2.toCharArray();
		 int i = 0;
		while ( i < ch1.length) 
		 {
			 int j = 0 , count = 0;
			 if(ch1[i++]==ch2[j])
			 {
				 while(j < ch2.length)
				 {
					 if(ch1[i]==ch2[j++])
						 count++;
				 }
			 }
		 }
	}
}
