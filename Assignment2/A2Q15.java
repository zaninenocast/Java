package simplilearn;

/* 15.	Two numbers are entered through the keyboard. Write a program to find the value of one number raised to the power of another.  */
public class A2Q15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int base = 3, exponent = 4;

        long result = 1;

        while (exponent != 0)
        {
            result *= base;
            --exponent;
        }

        System.out.println("Answer = " + result);

		
		

	}

}
