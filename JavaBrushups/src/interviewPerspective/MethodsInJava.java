package interviewPerspective;

public class MethodsInJava {

	public static void main(String[] args) {
		MethodsInJava d = new MethodsInJava();
		d.getData();
		//d.getData1();
		String name = d.getData1();
		System.out.println(name);
		getData2();
		MethodsInJava2 d1 = new MethodsInJava2();
		d1.getData();
		

	}
	public void getData()
	{
		System.out.println("Hello World");
		
	}
	public String getData1()
	{
		System.out.println("Hello World1");
		return "Saritha KS";
	}
	public static void getData2()
	{
		//By using static keyword we can directly call the method without using object
		System.out.println("No need to create an object to access this method");
	}

}
