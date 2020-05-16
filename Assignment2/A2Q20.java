package simplilearn;

import java.util.Scanner;
/*20.	Write a program to enter the numbers till the user wants and at the end it should display the maximum and minimum number entered.   */

public class A2Q20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner console = new Scanner(System.in);
		
        int number;         
        int max = Integer.MIN_VALUE;  
        int min = Integer.MAX_VALUE;

      char choice;

      do
      {
          System.out.print("Enter the number ");
          number = console.nextInt();
          if(number > max)
          {
              max = number;
          }

          if(number < min)
          {
              min = number;
          }

          System.out.print("Do you want to continue y/n? ");
          choice = console.next().charAt(0);

      }while(choice=='y' || choice == 'Y');
      System.out.println("Largest number: " + max);
      System.out.println("Smallest number: " + min);
      console.close();
	}

}
