package edu.jspiders.programming.strings;

import java.util.Scanner;

public class ReplaceChar 
{
	public static void main(String[] args)
	{
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("Enter the String : "); 
		 String str =sc.nextLine(); 							// hello welcome to jspiders
		 
				 char [] ch = str.toCharArray();
				 String res = "";
				 String s ="";
		 for (int i = 0; i < ch.length; i++)  //Logic to Store the value
			 {
			 			if(i == 0 || (ch[i] != ' ' && ch[i - 1] == ' ' ))
			 			{
			 				s =s+ch[i];
			 			}
			 	}
		 char[] temp =s.toCharArray();
		 int j = 0;
		int i = 0;
		for(; i < ch.length ; i++) // Logic to Rotate the char
		 {		 			 			
			 			if(i == 0 ) 
			 			{
			 					ch[i]=temp[temp.length-1] ;
			 	 				res =res + ch[i];	
			 			}
			 			else if( ch[i] != ' ' && ch[i - 1] == ' ' )
			 			{
			 				ch[i]=temp[j++] ;
		 	 				res =res + ch[i];
			 			}
			 			else
			 				res = res + ch[i];
			 }
		 System.out.println("Original String = "+str+"\n");
		 System.out.println("Resultant String = "+res+"\n");
		 System.out.println("Total Length of String = "+str.length());
		 			sc.close();
	}
}
