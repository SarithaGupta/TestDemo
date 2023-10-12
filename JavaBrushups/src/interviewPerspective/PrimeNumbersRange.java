package interviewPerspective;

public class PrimeNumbersRange {

	public static void main(String[] args) {
		for( int prime =1;prime <=100;prime++)
		{
			int n =0;
			if(n<=1)
			{
				System.out.println("Not a prime");
			}
			else if(prime % n ==0)
			{
				System.out.println("Not a prime");
			}
			else
			{
				System.out.println("It is prime");
			}
		}

	}

	

}
