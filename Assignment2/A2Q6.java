package simplilearn;

import java.util.Scanner;
/*6.	Write a program to check whether a triangle is valid or not, when the three angles of the triangle are entered by the user. A triangle is valid if 
 * the sum of all the three angles is equal to 180 degrees.   */

public class A2Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scer = new Scanner(System.in);
		System.out.println("Enter first angle :");
		int FirstAngle = scer.nextInt();
		System.out.println("your first Angle is "+FirstAngle);
		System.out.println("Enter second angle :");
		int SecondAngle = scer.nextInt();
		System.out.println("your Second Angle is "+SecondAngle);
		System.out.println("Enter third angle :");
		int ThirdAngle = scer.nextInt();
		System.out.println("your third Angle is "+ThirdAngle);	
		
		int Sum = FirstAngle + SecondAngle + ThirdAngle ;
		if (Sum > 180)
		{
			System.out.println("this is not a valid triangle");
			
		}
		else
		{
			System.out.println("yeah! your angle is valid");
			
		}
		scer.close();
		
	}

}
