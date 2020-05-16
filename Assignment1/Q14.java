package simplilearn;

import java.util.Scanner;
/* 14.	Write a program which accepts days as integer and display total number of years, months and days in it. for example:  If user input as 856 days the output should be 2 years 4 months 6 days. */


public class Q14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scr = new Scanner(System.in);
        System.out.println("enter total no of years");
        int a = scr.nextInt();
        while (a>=365)
        {
        	int b = a/364;
        	a = a%365;
        	System.out.println(b+" years");
         break;
        }
        while (a>=30)
        {
        	int c = a/30;
        	a = a % 30;
        	System.out.println(c+" months");
        }
          while (a >= 1)
          {
        	  int d = a/1;
        	  a = a% 1;
        	  System.out.println(d+" days");
        	  scr.close();
          }
        
	}

}
