package edu.jspiders.programming.arrays.TwoD;

import java.util.Scanner;

public class SpiralMatrix 
{
	public static void main(String[] args) 
	 {
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("Enter the Number of the Row");
		 int  row = sc.nextInt();
		 
		 System.out.println("Enter the Number of the Columns");
		 int  col = sc.nextInt();
		
		 int [][] arr =new int[row][col];
		 
		 int minrow = 0 , mincol = 0 , maxrow = row - 1 ,maxcol = col - 1;
		 int val = 1;
		 	while(val <= row * col)
		 	{
		 		for(int j = mincol ; j <= maxcol ; j++)
		 			arr[minrow][j]= val++;
		 		for(int i = minrow + 1 ; i <= maxrow ; i++)
		 			arr[i][maxcol] = val++;
		 		for(int j = maxcol - 1 ; j >= mincol ; j--)
		 			arr[maxrow][j] = val++;
		 		for(int i = maxrow - 1 ; i >= minrow + 1 ; i--)
		 			arr[i][mincol] = val++;
		 		
		 		minrow++;
		 		mincol++;
		 		maxrow--;
		 		maxcol--;
		 	}
		 System.out.println("Spiral Matrix Elements Are : ");
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
