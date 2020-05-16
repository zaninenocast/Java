package simplilearn;

import java.util.Scanner;
/*7.	Write a program to swap the values of two variables.  */

public class Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a;
        int b;
        int c;
        Scanner N1 = new Scanner(System.in);
        System.out.println("Enter your N1");
        a = N1.nextInt();
        System.out.println("Enter your N2");
        b = N1.nextInt();
        c=a;
        a=b;
        b=c;
        System.out.println(a);
        System.out.println(b);
        N1.close();
        
	}

}
