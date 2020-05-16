package simplilearn;

import java.util.Scanner;
/*18.	Write a program to check given number is prime or not.   */

public class A2Q18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scer = new Scanner(System.in);
		System.out.println("Enter your number:");
		int num = scer.nextInt();
		if (num > 0)
		{
			System.out.println("this is prime number");
		}
		else 
		{
			System.out.println("this is not a prime number");
		}
		scer.close();

	}

}
