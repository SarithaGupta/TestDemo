package interviewPerspective;

public class LeapYear {

	public static void main(String[] args) {
		for(int y=2000; y<=2100; y++)
		{
			
			if(y % 400 ==0)
			{
				System.out.println("\n" + y+ "is a Leap Year .");
			}
			else if(y % 100 == 0)
			{
				System.out.println("\n" +y+ "is not a Leap Year .");
			}
			else if(y % 4 == 0 )
			{
				System.out.println("\n" +y+ "is a Leap Year .");
			}
			else {
				System.out.println("\n" +y+ "is not a Leap Year .");
			}
		}
			


	}

}
