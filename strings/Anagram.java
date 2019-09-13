package edu.jspiders.programming.strings;

import java.util.Scanner;

public class Anagram 
{
	public static void main(String[] args)
	{
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("Enter the First String : "); 
		 String s1 =sc.nextLine(); 											// LISTEN
		 
		 System.out.println("Enter the Second String : "); 
		 String s2 =sc.nextLine(); 										// SILENT
		 
		 char[] ch1 =s1.toCharArray();
		 char[] ch2 =s2.toCharArray();
		 		if(ch1.length != ch2.length)
		 		{
		 			System.out.println("Strings are not Anagram");
		 		}
		 		else
		 		{
		 			for(int i = 0 ; i<ch1.length -1; i++) // Logic for Bubble Sort
		 			{
		 				for(int j= 0 ; j<ch1.length -1-i; j++)
		 				{
		 					if(ch1[j] > ch1[j+1])
		 					{
		 						char temp = ch1[j];
		 						ch1[j] = ch1[j+1];
		 						ch1[j+1] = temp;
		 					}
		 				}		
		 			}
		 			int i = 0;
		 			while(i < ch1.length && ch1[i] == ch2[i])
		 					i++;
		 			if(i == ch1.length)
		 				System.out.println("Strings are Anagram");
		 			else
		 				System.out.println("Strings are  not Anagram");
		 		}
		 		sc.close();
	}
}
