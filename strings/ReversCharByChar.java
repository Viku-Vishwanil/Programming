package edu.jspiders.programming.strings;

import java.util.Scanner;

public class ReversCharByChar 
{
	public static void main(String[] args)
	{
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("Enter the String : "); 
		 String str =sc.nextLine(); 							// hello welcome to jspiders
		 
				 char [] ch = str.toCharArray();
				 String res = "";
				 
		 for (int i = 0; i < ch.length; i++)  //Logic for Reverse char by char of Sentence
			 {
			 		int k = i;
			 		while(i < ch.length && ch[i] !=' ')
			 				i++;
			 		int j = i - 1;
			 			while(j >= k)
			 			{
			 				res =res + ch[j];
			 					j--;
			 			}
			 			if(i <ch.length)
			 				res = res + ch[i];
			 }
		 System.out.println("Original String = "+str+"\n");
		 System.out.println("Resultant String = "+res+"\n");
		 System.out.println("Total Length of String = "+str.length());
		 			sc.close();
	}
}
