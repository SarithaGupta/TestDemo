package string;

public class ExtractNumbersFromStringUsingRegex {

	public static void main(String[] args) {
		/*String str = "XXXX1234G21";
		

		String digits = str.replaceAll("[^0-9]", "");
		
		//str=str.replaceAll("[^a-zA-Z]", "");
		
		//System.out.println(str);
		
		int sum = 0;
		for (int i = 0; i < digits.length(); i++)
		{
		    sum += Integer.parseInt(String.valueOf(digits.charAt(i)));
		}
		System.out.println("Total Sum = " +sum);*/
								
 //Interview Qn :How to remove special characters or Junk in string
		String s="&fghj4567#$*&(vbnfh12408Fg34^%";
		String s1= "###$$$#% Java *&^%# Selenium!!#@$$$$$$$$$$SQL";
		s =s.replaceAll("[^a-zA-Z0-9]", "");
		s1 = s1.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println("String after removing special charaters " +s);
		System.out.println("String after removing all junk " +s1);
		
	}

	

}
