package simplilearn;

import java.util.Scanner;
/* 5.	If the ages of Ram, Sulabh and Ajay are input by the user, WAP to determine the youngest user. */

public class A2Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter age of Ram :");
		int Ram = scan.nextInt();
		System.out.println("Enter age of Sulabh :");
		int Sulabh = scan.nextInt();
		System.out.println("Enter age of Ajay :");
		int Ajay = scan.nextInt();
		if (Ram > Sulabh)
		{
			System.out.println("Ram is youngest one");
		}
		else if(Sulabh >Ajay)
		{
			System.out.println("Sulabh is Younge among three");
		}
		else {
			System.out.println("Ajay is youngest one");
		}
		
		
		
 scan.close();
	}

}
