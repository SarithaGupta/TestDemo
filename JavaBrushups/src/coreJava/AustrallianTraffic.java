package coreJava;

import interviewPerspective.CentralTraffic;
import interviewPerspective.continentalTraffic;

public class AustrallianTraffic implements CentralTraffic,continentalTraffic {

	public static void main(String[] args) {
		CentralTraffic a = new AustrallianTraffic();
		a.greenGo();
		a.redStop();
		a.flashYellow();
		AustrallianTraffic at = new AustrallianTraffic();
		at.walkon();
		continentalTraffic ct = new AustrallianTraffic();
		ct.trainTraffic();
		

	}

	@Override
	public void greenGo() {
		System.out.println("green go implementation");
		
	}

	@Override
	public void redStop() {
		System.out.println("red stop implementation");
		
	}
public void walkon()
{
	System.out.println("walking implementation");
}
	@Override
	public void flashYellow() {
		System.out.println("continue with caution  implementation");
		
	}

	@Override
	public void trainTraffic() {
		System.out.println("Train implementation");
		
	}

}
