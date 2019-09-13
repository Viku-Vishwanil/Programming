package edu.jspiders.programming.number;

public class Arm 
{
	 public static void main(String[] args) 
	 {
		 int num = 153;
		 int temp = num;
		 int sum = 0;
		 int r;
		 while(num >0)
		 {
			 r= num%10;
			 num=num/10;
			 sum=sum+r*r*r;
		 }
		 if(sum==temp)
		 {
			 System.out.println("Armstrong");
		 }
		 else
		 {
			 System.out.println("Armstrong");
		 }
	}
}
