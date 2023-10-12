package coreJava;

public class ChildAircraft extends ParentAircraft{

	public static void main(String[] args) {
		ChildAircraft c= new ChildAircraft();//creating object of child class
		c.safetyGuidelines();
		c.engine();
		c.bodycolor();
		//ParentAircraft p =new ParentAircraft();//Basically you cannot create object for the
		                      //class  whih is marked as abstract
			//You cannot instantiate abstract classes
		
	}

	@Override
	public void bodycolor() {
		System.out.println("Red color on the body");
		
	}

}
