package edu.jspiders.programming.arrays.TwoD;

import java.util.Scanner;

public class MatrixRotation90Left 
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
		 for(int i = 0 ; i<col; i++) // Logic to Reverse Matrix Column wise
		 {
			for(int j = 0 ; j<row/2; j++)
			{
				int temp = arr[j][i];
				arr[j][i] = arr[j][row - 1 - i];
				arr[j][row - 1 - i] = temp;
			}
		 }
			 int [][] res = new int[col][row]; // Logic to Transpose
			 for(int i = 0 ; i<col; i++)
			 {
				for(int j = 0 ; j<row; j++)
				{
					res[i][j]=arr[j][i];
				}
			 }
			 System.out.println("After Rotate 90 degree Left Matrix Elements Are : ");
			 for(int i = 0 ; i<col; i++)
			 {
				for(int j = 0 ; j<row; j++)
				{
					System.out.print(" "+res[i][j]+"\t");
				}
				System.out.println();
			 }
			 sc.close();
		 }
}
