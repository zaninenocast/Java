package simplilearn;

import java.util.Scanner;
/* 8.	In a company an employee is paid as under: 
If his basic salary is less than Rs. 1500, then HRA = 10% of basic salary and DA = 90% of basic salary. If his salary is either equal to or above Rs. 1500, then HRA = Rs. 500 and DA = 98% of basic salary. If the employee's salary is input by the user write a program to find his gross salary.  
*/
public class A2Q8 {

	public static void main(String[] args) {
		int HRA;
		int DA;
		int GrossSalary;
		// TODO Auto-generated method stub
		
		Scanner scer = new Scanner(System.in);
		System.out.println("enter employee basic  salary:");
		int BasicSalary = scer.nextInt();
		System.out.println("employ's basic salary is :"+BasicSalary);
		if (BasicSalary < 15000)
		{
			HRA = (BasicSalary*10)/100;
			System.out.println("HRA is:"+HRA);
			DA = (BasicSalary*90)/100;
			System.out.println("DA is:"+DA);
			GrossSalary = HRA + DA;
			System.out.println("Gross salary is :"+GrossSalary);
			
		}
		
		
     scer.close();
	}

}
