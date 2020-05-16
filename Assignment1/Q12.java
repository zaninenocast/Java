package simplilearn;

import java.util.Scanner;
/* 12.	Write a program which accepts amount as integer and display total number of Notes of Rs. 500, 100, 50, 20, 10, 5 and 1.
For example, when user enter a number, 575,
the results would be like this...
500: 1, 100: 0, 50: 1, 20: 1, 10: 0, 5: 1, 1: 0 
 */
public class Q12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rs;
		int a;
		int b;
		int c;
		int d;
		int e;
		int f;
		int g;
		Scanner scan = new Scanner(System.in);
		System.out.println("enter your rupee");
		rs = scan.nextInt();
		while (rs>=500)
		{
			a=rs/500;
			rs=rs%500;
			System.out.println(a);
			break;
		}
		while (rs>=100)
		{
			b=rs/100;
			rs=rs%100;
			System.out.println(b);
			break;
		}
		while (rs>=50)
		{
			c=rs/50;
			rs=rs%500;
			System.out.println(c);
			break;
		}
		while (rs>=10)
		{
			d=rs/500;
			rs=rs%500;
			System.out.println(d);
			break;
		}
		while (rs>=5)
		{
			e=rs/5;
			rs=rs%5;
			System.out.println(e);
			break;}
		while (rs>=2)
		{
			f=rs/2;
			rs=rs%2;
			System.out.println(f);
			break;}
		while (rs>=1)
		{
			 g=rs/1;
			rs=rs%1;
			System.out.println(g);
			break;}
		
	    
		scan.close();

	}

}
