package simplilearn;

import java.util.Scanner;
/* 11.	The marks obtained by a student in 5 different subjects are input by the user. The student gets a division as per the following rules:
Percentage above or equal to 60 - First division
Percentage between 50 and 59 - Second division
Percentage between 40 and 49 - Third division
Percentage less than 40 - Fail
Write a program to calculate the division obtained by the student.  
*/

public class A2Q11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scer = new Scanner(System.in);
		System.out.println("enter percentage:");
		int Per = scer.nextInt();
		if(Per >= 60)
		{
			System.out.println("First devision");
			
		}
		else if(Per < 59 && Per >=50)
		{
			System.out.println("Second devision");
		}
		else if (Per <49 && Per > 37)
		{
			System.out.println("Third devision");
		}
		else {
			System.out.println("Fail");
		}
		
		scer.close();
	}

}
