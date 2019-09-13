package edu.jspiders.programming.strings;

import java.util.Scanner;

public class UpperAndLowerCase 
{
	public static void main(String[] args) 
	{
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("Enter the String : "); 
		 String str =sc.nextLine(); 							// Hello Welcome to Jspiders
		 
				 char [] ch = str.toCharArray();
				 int uCount = 0 , lCount =0;
				 
		 for (int i = 0; i < ch.length; i++) 
			 {
				if(ch[i] >= 'A' && ch[i] <= 'Z' )
						uCount++;
				else if(ch[i] >= 'a' && ch[i] <= 'z') 
						lCount++;
			}
		 System.out.println("Number of UpperCase character = "+uCount);
		 System.out.println("Number of LowerCase character = "+lCount);
		 System.out.println("Total Length of String = "+str.length());
		 			sc.close();
	}
}
