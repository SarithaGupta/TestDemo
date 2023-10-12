package coreJava;

public class B extends TestInheritance {
	
	public static void helloWorld()
	{
		System.out.println("Hi, This is derived class");
	}

	public static void main(String[] args) {
		TestInheritance superObj = new TestInheritance();
		B obj = new B();
		
		//superObj.helloWorld();
		helloWorld();
		//helloWorld();
	}

}
