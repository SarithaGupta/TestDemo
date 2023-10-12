package string;

public class SwapStrings⁬WithoutUseThirdVariable {

	public static void main(String[] args) {
		String str1="Welcome";
		String str2="Hello";
		
		System.out.println("before Swapping String1 : " +str1);
		System.out.println("before Swapping String2 : " +str2);
		
		str1=str1.concat(str2);
		
		str2=str1.substring(0, str1.length()-str2.length());
		str1=str1.substring(str2.length());
		
		
		System.out.println("String 1 : " +str1);
		System.out.println("String 2 : " +str2);
		
						
		
		/*str1 = str1.concat(str2);
		System.out.println("string1: " +str1);
		str2 = str1.substring(0,str1.length()-str2.length());
		System.out.println("string2: " +str2);
		str1 = str1.substring(str2.length());
		System.out.println(str1);
		System.out.println(str2);*/
		

	}

}
