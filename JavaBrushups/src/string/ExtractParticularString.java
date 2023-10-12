package string;

public class ExtractParticularString {

	public static void main(String[] args) {
		
//Using Contains method	
		
		/*String str1 = "Hello how are you, welcome to Tutorialspoint";
	      String str2 = "Tutorialspoint";
	      if (str1.contains(str2)){
	         System.out.println("Search successful");
	      }
	      else {
	         System.out.println("Search not successful");
	      }*/
		
//Using substring() method
		
		/*String str = "Welcome to Tutorialspoint";
	      String sub = str.substring(11, 25);
	      System.out.println(sub);*/
	      
//Using Split method
	      
		String text ="This is Automation Practice Test Automation Automation";
	    String searchString ="Automation";
		int count =0;			
		String[] extractedString = text.split(" ");	
		System.out.println(text.length());
		System.out.println("extractedString length " +extractedString.length);
		for(int i=0;i<extractedString.length;i++)
		{
		
		if(extractedString[i].contains(searchString))
		{
			count = count +1;
			
			System.out.println("Targetted String found " +extractedString[i]);
			System.out.println("index is " +i);
					
		}	
		
	
		}
		System.out.println("Number of Occurances of a particular String " +count);
		
		
	}
	
}
