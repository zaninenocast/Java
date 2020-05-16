package simplilearn;

import java.util.Scanner;
/*9.	Write a program to calculate the monthly telephone bills as per the following rule:
Minimum Rs. 200 for up to 100 calls.
Plus Rs. 0.60 per call for next 50 calls.
Plus Rs. 0.50 per call for next 50 calls.
Plus Rs. 0.40 per call for any call beyond 200 calls.  
 */
public class A2Q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c;
		int b1;
		double b2;
		double b3;
		double b4;
		Scanner scer = new Scanner(System.in);
		System.out.println("enter no of calls:");
		c = scer.nextInt();
		System.out.println("total call min:"+c);
		 b1=200;
		 b2=200+(0.60*c);
		 b3=200+(0.60*c)+(0.50*c);
		 b4=200+(0.60*c)+(0.50*c)+(0.40*c);
		 if (c<= 100)
		 {
			 System.out.println("your total bill is :"+b1);
			 
		 }
		 
		 else if (c>100 && c<=150)
		 {
			 System.out.println("your total bill is :"+b2);
		 }
		 else if (c>150 && c<=200)
		 {
			 System.out.println("your total bill is :"+b3); 
		 }
		 else {
			 System.out.println("your total bill is :"+b4);
			 
		 }
		
         scer.close();
	}

	
		
	}


