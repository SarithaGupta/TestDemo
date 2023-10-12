package string;

public class JavaStringConcepts {

	public static void main(String[] args) {
		//String literal
		//String s1= "Rahul Shetty Academy";
		//String s2 = "Rahul Shetty Academy";
		
		//new keyword
		String s3 = new String("Welcome");
		String s4 = new String("Welcome");
		
		String s = "Rahul Shetty Academy";
		String[] splittedString = s.split(" ");//Splitting with white space
		System.out.println(splittedString[0]);
		System.out.println(splittedString[1]);
		System.out.println(splittedString[2]);
		System.out.println("*************");
		String[] splittedString1 = s.split("Shetty");
		System.out.println(splittedString1[0]);
		System.out.println(splittedString1[1]);
		System.out.println(splittedString1[1].trim());
		
		System.out.println("*************");
		for(int i=0;i<s.length();i++)
		{
			System.out.println(s.charAt(i));
		}
		System.out.println("*************");
		//reverse
		for(int i= s.length()-1;i>=0;i--)
		{
			System.out.println(s.charAt(i));
		}
		
		
	}

}
