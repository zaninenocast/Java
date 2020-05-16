package simplilearn;

import java.util.Scanner;
/*
11.	Write a program which input three numbers and display the largest number using ternary operator. 
*/

public class Q11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		int b;
		int c;
		Scanner Lar = new Scanner(System.in);
		System.out.println("enter a");
		a = Lar.nextInt();
		System.out.println("enter b");
		b = Lar.nextInt();
		System.out.println("enter c");
		c = Lar.nextInt();
			if (a>b)
			{
				System.out.println(a);
			}
			else if(b>c)
			{
				 System.out.println(b);
			}
			else 
			{
				System.out.println(c);
			}
		Lar.close();
	}	

}
