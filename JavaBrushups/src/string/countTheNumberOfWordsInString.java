package string;

public class countTheNumberOfWordsInString {

	public static void main(String[] args) {
		String Str = "This is example of Java Programming";
		
		System.out.println(Str.length());
		String trimmedStr = Str.trim();
		System.out.println(trimmedStr.length());				
		int  count = Str.split("\\s+").length;
		System.out.println(count);

	}

}
