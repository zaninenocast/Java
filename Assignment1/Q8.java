package simplilearn;

import java.util.Scanner;

/* 8.	Write a program to check whether the given number is positive or negative (ternary operator)  */

public class Q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scer = new Scanner(System.in);
	        System.out.println("Enter the number :");
	        int num = scer.nextInt();

	        if (num>0)
	            System.out.println("Its a positive value ");
	        else
	            System.out.println("Its a negetive value ");

	    }
	     
	}


