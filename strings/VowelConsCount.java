package edu.jspiders.programming.strings;

import java.util.Scanner;

public class VowelConsCount 
{
	public static void main(String[] args) 
	{
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("Enter the String : ");
		 String str =sc.nextLine();						// Hello Welcome to Jspiders
		 
				 char [] ch = str.toCharArray();
				 int vCount = 0 , cCount =0;
				 
		 for (int i = 0; i < ch.length; i++) 
				 {
					if(ch[i] == 'A' ||ch[i] == 'a' ||ch[i] == 'E' ||ch[i] == 'e' ||ch[i] == 'I' ||ch[i] == 'i' 
							|| ch[i] == 'O' ||ch[i] == 'o' ||ch[i] == 'U' ||ch[i] == 'u')
														vCount++;
					
					else if((ch[i] >= 'A' && ch[i] <= 'Z' )||(ch[i] >= 'a' && ch[i] <= 'z') )
											cCount++;
				 }
		 
		 System.out.println("Number of Vowels = "+vCount);
		 System.out.println("Number of Consonant = "+cCount);
		 System.out.println("Total Length of String"+str.length());
		 			sc.close();
	}
}
