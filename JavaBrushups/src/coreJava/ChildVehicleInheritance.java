package coreJava;

public class ChildVehicleInheritance extends ParentVehicleInheritance {
//Java won't support multiple inheritance . C++ supports that
//multiple inheritance is achieved with the help of interfaces.
	
	int i =20;
	public static void main(String[] args) {
		ChildVehicleInheritance ch = new ChildVehicleInheritance();
		//ParentVehicleInheritance ch = new ChildVehicleInheritance();
		System.out.println(ch.i);
		ch.brakes();
		ch.gear();
		ch.colour();
		ch.engine();
		ch.audioSystem();//Method overriding
		
		

	}
	
	//method overriding
	//want to enhance my audio system in child class
	//In overriding , both the method has same name ,same arguments,same data type
	//We are just replacing the parent audio system and implementing the child audio system
	public void audioSystem()
	{
		System.out.println("Enhanced Child Audio system is implemented");
	}
	
	public void colour() {
		System.out.println(color);
		
	}
	public void engine()
	{
		System.out.println("engine ode is implemented");
	}

}
