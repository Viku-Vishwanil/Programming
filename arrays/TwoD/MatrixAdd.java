package edu.jspiders.programming.arrays.TwoD;

import java.util.Scanner;

public class MatrixAdd 
{
	public static void main(String[] args) 
	 {
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("Enter the Number of the Row");
		 int  row = sc.nextInt();
		 
		 System.out.println("Enter the Number of the Columns");
		 int  col = sc.nextInt();
		
		 int [][] a =new int[row][col];
		 System.out.println("Enter the values for the First Matrix");
		 for(int i = 0 ; i<row; i++)
		 {
			for(int j = 0 ; j<col; j++)
			{
				a[i][j]=sc.nextInt();
			}
		 }
		 int [][] b =new int[row][col];
		 System.out.println("Enter the values for the Second Matrix");
		 for(int i = 0 ; i<row; i++)
		 {
			for(int j = 0 ; j<col; j++)
			{
				b[i][j]=sc.nextInt();
			}
		 }
		 System.out.println("First Matrix Elements Are : ");
		 for(int i = 0 ; i<row; i++)
		 {
			for(int j = 0 ; j<col; j++)
			{
				System.out.print(" "+a[i][j]+"\t");
			}
			System.out.println();
		 }
		 System.out.println("Second Matrix Elements Are : ");
		 for(int i = 0 ; i<row; i++)
		 {
			for(int j = 0 ; j<col; j++)
			{
				System.out.print(" "+b[i][j]+"\t");
			}
			System.out.println();
		 }
		
		 int [][] res = new int[row][col];
		 for(int i = 0 ; i<row; i++) //Logic to perform Matrix add
		 {
			for(int j = 0 ; j<col; j++)
			{
				res[i][j]=a[i][j] + b[i][j];
			}
		 }
		 System.out.println("Addition Matrix Elements Are : ");
		 for(int i = 0 ; i<row; i++)
		 {
			for(int j = 0 ; j<col; j++)
			{
				System.out.print(" "+res[i][j]+"\t");
			}
			System.out.println();
		 }
		 sc.close();
	 }
}
