package edu.jspiders.programming.strings;

import java.util.Scanner;

public class ConversionOfCase 
{
	public static void main(String[] args)
	{
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("Enter the String : "); 
		 String str =sc.nextLine(); 							// Hello Welcome to Jspiders
		 
				 char [] ch = str.toCharArray();
				 String res = "";
				 
		 for (int i = 0; i < ch.length; i++) 
			 {
				if(ch[i] >= 'A' && ch[i] <= 'Z' )
						ch[i] = (char)(ch[i] + 32);
				
				else if(ch[i] >= 'a' && ch[i] <= 'z') 
					ch[i] = (char)(ch[i] - 32);
				
						res = res + ch[i];
			 }
		 System.out.println("Original String = "+str+"\n");
		 System.out.println("Resultant String = "+res+"\n");
		 System.out.println("Total Length of String = "+str.length());
		 			sc.close();
	}
}
