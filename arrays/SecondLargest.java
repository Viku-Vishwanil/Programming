package edu.jspiders.programming.arrays;

import java.util.Scanner;

public class SecondLargest {
	public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("Enter the Size of the Array");
		 int [] arr = new int[sc.nextInt()];
		 
		 System.out.println("Enter the values for the Array");
		 for(int i = 0 ; i<arr.length ; i++)
		 {
			 arr[i] = sc.nextInt();
		 }
		 int largest, sLargest;
		 largest =arr[0];
		sLargest = arr[1];
		 for(int i = 1 ; i<arr.length ; i++) //  Logic for Second largest Element in Array
		 {
			 if(arr[i] > largest)
			 {
				 sLargest = largest;
				 largest = arr[i];
			 }
			 else if (arr[i] > sLargest)
			 {
				 sLargest = arr[i];
			 }
		 }
		 System.out.println("Second Largest = "+ sLargest);
		 		sc.close();
	}

}
