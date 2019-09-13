package edu.jspiders.programming.strings;

import java.util.Scanner;

public class SubString 
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
		 for (int i = 0; i < ch1.length; i++) 
		 {
			 int j =0;
			 while (i < ch1.length && j < ch2.length && ch1[i] == ch2[j]) 
			 {
				i++;
				j++;
			}
			 if(j == ch2.length)
			 {
				 System.out.println("Sub String is a part of String");
				 return;
			 }
		}
		 System.out.println("Sub String is not a part of String");
	}
}
