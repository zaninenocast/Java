package simplilearn;

import java.util.Scanner;
/*5.	Write a program which accept temperature in Fahrenheit and print it in centigrade. */

public class Q5{

	public static void main(String[] args) {
		float tem;
		float cen;
		
		// TODO Auto-generated method stub
		Scanner temp = new Scanner(System.in);
		System.out.println("Enter tem");
		tem = temp.nextFloat();
		cen = 5*(tem-32)/9;
		System.out.println("your cen value is "+cen);
		temp.close();

	}

}
