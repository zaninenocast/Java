package simplilearn;

import java.util.Scanner;
/*4.	Write a program which accept 
 * two numbers and print their sum. */  


public class Q {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner num = new Scanner(System.in);
	   System.out.println("Enter your first number ");
	   int firstN = num.nextInt();
	   System.out.println("your first num is "+firstN);
	   System.out.println("Enter your second number");
	   int secondN = num.nextInt();
	   System.out.println("your second number is "+secondN);
	    int Sum = firstN + secondN ;
	    System.out.println(Sum);
	    num.close();
	  
	}

}
