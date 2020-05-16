package simplilearn;

import java.util.Scanner;

/* 6.	Write a program which accept principle, rate and time from user and print the simple interest.*/

public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float p ;
		float r;
		float si ;
		float t;
		Scanner value = new Scanner(System.in);
		System.out.println("Enter your principal");
		p = value.nextFloat();
		System.out.println("Enter your rate");
		r = value.nextFloat();
		System.out.println("Enter your time");
		t = value.nextFloat();
		si = p*r*t/100;
		System.out.println("your simple intrest is"+si);
		
      
	value.close();	
	}
	

}
