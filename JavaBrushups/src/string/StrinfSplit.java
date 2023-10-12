package string;

public class StrinfSplit {

	public static void main(String[] args) {
		
//Custom input string
		      String str = "java,selenium,maven,jenkins";
		        String[] arrOfStr = str.split(",",3);
		
		        for (String a : arrOfStr)
		            System.out.println(a);
		
		/*String s = "a,b,c,d,e,f,g,h";
		String[] arr = s.split(",",7);
		for (String a: arr)
			System.out.println(a);*/
		
//String Concatenation
		
		String str1 = "ABC44436";
		String str2 = "DEF";
		String str3 = "GHI";
		String[] arrString= str1.split("C");
		System.out.println(arrString[1]);
		String firstIndex =arrString[1];
		System.out.println(firstIndex+10);
//Converting string to integer
		int number = Integer.parseInt(firstIndex);
//Doing Addition operation 
		System.out.println("After Adding 10 with number: " +(number +10 ));
//Converting integer to string 
		String value= String.valueOf(number);
		System.out.println("After coverting integer to string");
		System.out.println(value+10);
		System.out.println(firstIndex.getClass());
		String concat = str1.concat(str2).concat(str3);
		System.out.println(concat);
		int Test = str1.codePointCount(0, 8);
		System.out.println("Testing " +Test);
		
//How to Reverse a String in Java?
		/*String str = "Saritha";
		char[] reversestr=str.toCharArray();
		for(int i=reversestr.length-1;i>=0;i--)
			System.out.print(reversestr[i]);
		
		
//------selecting an item from Dropdown without select statement
		/*List<WebElement> allOptions=driver.findElements(By.cssSelector("select option"));
		String option="Highest to lowest";

		         for(int i=0; i<allOptions.size(); i++) {

		            if(allOptions.get(i).getText().contains(option)) {

		                     allOptions.get(i).click();

		                     System.out.println("clicked");

		                     break;

		               }

		         }	*/
		
		   

	}

}
