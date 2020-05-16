package simplilearn;
import java.util.Scanner;
/* 19.	Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered.  */
public class A2Q19 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 
		
		        Scanner console = new Scanner(System.in);
		 
		        int number;         
		          int  countPositive = 0; 
		          int  countNegative = 0;
		          int   countZero = 0;
		 
		        char choice;
		 
		        do
		        {
		            System.out.print("Enter the number ");
		            number = console.nextInt();
		 
		            if(number > 0)
		            {
		                countPositive++;
		            }
		            else if(number < 0)
		            {
		                countNegative++;
		            }
		            else
		            {
		                countZero++;
		            }
		 
		            System.out.print("Do you want to continue y/n? ");
		            choice = console.next().charAt(0);
		 
		        }while(choice=='y' || choice == 'Y');
		 
		        System.out.println("Positive numbers: " + countPositive);
		        System.out.println("Negative numbers: " + countNegative);
		        System.out.println("Zero numbers: " + countZero);
		        console.close();
		    }  
		
	}


