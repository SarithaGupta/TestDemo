package interviewPerspective;

public class Encapsulation {
	private String name;
	public String getName() {
	return name;
	}
	public void setName(String name) {
	this.name = name;
	}
	

	public static void main(String[] args) {
		Encapsulation e = new Encapsulation();
		e.setName("Harry Potter");
		System.out.println(e.getName());

	}

}
