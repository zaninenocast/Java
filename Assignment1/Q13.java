package simplilearn;

import java.util.Scanner;
/* 13.	Write a program which accepts a character and display its next character.  */

public class Q13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     char ch1;
     Scanner sc = new Scanner (System.in);
     char ch;
     System.out.println("enter a character");
     ch = sc.next().charAt(0);
     ch1 = Character.toUpperCase(ch);
     for (char c = 'A';c <= 'Z';++c)
    	 if(c== ch1)
    	 {
    		 c++;
    		 System.out.println(c);
    	 }
      sc.close();
      
      
	}

}
