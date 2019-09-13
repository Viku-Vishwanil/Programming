package edu.jspiders.programming.arrays.TwoD;

import java.util.Scanner;

public class MatrixMultipication 
{
	public static void main(String[] args) 
	 {
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("Enter the Number of the Row for Array A");
		 int  row1 = sc.nextInt();
		 
		 System.out.println("Enter the Number of the Columns for Array A");
		 int  col1 = sc.nextInt();
		 
		 System.out.println("Enter the Number of the Row for Array B");
		 int  row2 = sc.nextInt();
		 
		 System.out.println("Enter the Number of the Columns for Array B");
		 int  col2 = sc.nextInt();
		 if(col1 == row2)
		 {
			 int [][] a =new int[row1][col1];
			 System.out.println("Enter the values for the First Matrix");
		 
			 for(int i = 0 ; i<row1; i++)
			 {
				for(int j = 0 ; j<col1; j++)
				{
					a[i][j]=sc.nextInt();
				}
			 }
		 int [][] b =new int[row2][col2];
		 System.out.println("Enter the values for the Second Matrix");
		 for(int i = 0 ; i<row2; i++)
		 {
			for(int j = 0 ; j<col2; j++)
			{
				b[i][j]=sc.nextInt();
			}
		 }
		 System.out.println("First Matrix Elements Are : ");
		 for(int i = 0 ; i<row1; i++)
		 {
			for(int j = 0 ; j<col1; j++)
			{
				System.out.print(" "+a[i][j]+"\t");
			}
			System.out.println();
		 }
		 System.out.println("Second Matrix Elements Are : ");
		 for(int i = 0 ; i<row2; i++)
		 {
			for(int j = 0 ; j<col2; j++)
			{
				System.out.print(" "+b[i][j]+"\t");
			}
			System.out.println();
		 }
		 int [][] res = new int[row1][col2]; //Logic to Matrix Multiplication
		 for(int i = 0 ; i < row1 ; i++)
		 {
			 for(int j = 0 ; j < col2 ; j++)
			 {
				 for(int k = 0 ; k < row2 ; k++)
				 {
					 res[i][j] = res[i][j] + a[i][k] * b[k][j];
				 }
			 }
		 }
			 System.out.println("Multiplication Matrix Elements Are : ");
			 for(int i = 0 ; i<row1; i++)
			 {
				for(int j = 0 ; j<col2; j++)
				{
					System.out.print(" "+res[i][j]+"\t");
				}
				System.out.println();
			 }
		 } 
		 else
		 {
			 System.out.println("Matrix Multiplication is not Possible");
		 }
		sc.close();
	}
}
