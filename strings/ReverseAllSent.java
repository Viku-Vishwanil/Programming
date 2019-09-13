package edu.jspiders.programming.strings;

import java.util.Scanner;

public class ReverseAllSent 
{
	public static void main(String[] args)
	{
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("Enter the String : "); 
		 String str =sc.nextLine(); 							// hello welcome to jspiders
		 
				 char [] ch = str.toCharArray();
				 String res = "";
				 
		 for (int i = ch.length-1; i >0; i--)  //Logic forReverse entire Sentence
			 {
			 int j = i;
		 		while(i >= 0 && ch[i] !=' ')
		 				i--;
		 		int k = i + 1;
		 			while(k <= j)
		 			{
		 				res =res + ch[k];
		 					k++;
		 			}
		 			if(i >=0)
					
				res = res + ch[i];
			 }
		 System.out.println("Original String = "+str+"\n");
		 System.out.println("Resultant String = "+res+"\n");
		 System.out.println("Total Length of String = "+str.length());
		 			sc.close();
	}
}
