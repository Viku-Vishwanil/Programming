package edu.jspiders.programming.arrays.TwoD;

import java.util.Scanner;

public class InputFromUser 
{
	public static void main(String[] args) 
	 {
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("Enter the Number of the Row");
		 int  row = sc.nextInt();
		 
		 System.out.println("Enter the Number of the Columns");
		 int  col = sc.nextInt();
		
		 int [][] arr =new int[row][col];
		 System.out.println("Enter the values for the Matrix");
		 for(int i = 0 ; i<row; i++)
		 {
			for(int j = 0 ; j<col; j++)
			{
				arr[i][j]=sc.nextInt();
			}
		 }
		 System.out.println("Matrix Elements Are : ");
		 for(int i = 0 ; i<row; i++)
		 {
			for(int j = 0 ; j<col; j++)
			{
				System.out.print(" "+arr[i][j]+"\t");
			}
			System.out.println();
		 }
		 sc.close();
	 }
}
