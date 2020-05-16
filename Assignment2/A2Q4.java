package simplilearn;

import java.util.Scanner;
/*4.	Write a program to determine whether the seller has made profit or incurred loss. Also determine how much profit he made or loss he incurred. Cost 
 * price and selling price of an item is input by the user.   
 **/

public class A2Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int loss;
		int Profit;
		Scanner scer = new Scanner(System.in);
		System.out.println("Enter your cost prize: ");
		int CostPrize = scer.nextInt();
		System.out.println("your cost prize is "+CostPrize);
		System.out.println("Enter your selling prize:");
		int SellPrize = scer.nextInt();
		System.out.println("your selling prize is:"+SellPrize);
		if ( CostPrize > SellPrize)
		{
			System.out.println("you are facing a loss ");
			loss = CostPrize -  SellPrize;
			System.out.println("your loss is of"+loss);
			
		}
		else 
		{
			System.out.println("yeah!got profit");
			Profit = SellPrize - CostPrize;
			System.out.println("Your profit is :"+Profit);
			
			
		}
scer.close();
	}

}
