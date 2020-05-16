package simplilearn;
/*  16.	Write a program to reveres any given integer number.*/
import java.util.Scanner;

public class A2Q16 {

	public static void main(String[] args) {
		int reverse = 0;
	
		// TODO Auto-generated method stub
		Scanner scer = new Scanner(System.in);
		System.out.println("Enter your number to reverse :");
		int n = scer.nextInt();
		while(n != 0)
	    {
	      reverse = reverse * 10;
	      reverse = reverse + n%10;
	      n = n/10;
	    }

	    System.out.println("Reverse of the number is " + reverse);
		int rem= 0;
		int sum = 0;
	    Scanner scerr = new Scanner(System.in);
		System.out.println("Enter your number to reverse :");
		int num = scerr.nextInt();
	    while(num  > 0)
	    {
	     	rem = num % 10;
	     	sum = sum + rem;
	     	num = num / 10;
	     	
	    }
	    System.out.println("sum is :"+sum);
	    
	    scer.close();
	    scerr.close();

	}

}
