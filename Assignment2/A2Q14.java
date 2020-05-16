package simplilearn;

import java.util.Scanner;
/* 14.	Write a program to find the factorial value of any number entered through the keyboard.  */

public class A2Q14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scer = new Scanner(System.in);
		System.out.println("enter your number:");
		int num = scer.nextInt();
		int fact=1;
		for (int i=1;i <= num;i++)
		{
			 fact = fact*i;
			 
		}
		System.out.println(fact);
		scer.close(); 
		

	}

}
