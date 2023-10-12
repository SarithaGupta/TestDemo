package coreJava;

public abstract class ParentAircraft {
	
	public void safetyGuidelines()
	{
		System.out.println("Follow safety guidelines");
	}
	//private void engine() //You can have public, protected or default. but you cannot have private access modifier
	      // for the methods defined in abstrat class
	public void engine() //if any method declared as private , though you inherit you cannot use the methods which are declared as a private.
	{
		System.out.println("Follow engine guidelines");
	}
	public abstract void bodycolor();

}
