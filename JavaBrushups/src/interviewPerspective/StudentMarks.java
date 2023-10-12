package interviewPerspective;

public class StudentMarks {
	
	int math;
	int computer;
	int science;
	int english;
	
	public int sumOfAllSubjects() {
		int totalMarks = math +computer +science +english ;
		return totalMarks;
	}
	public int avgOfAllSubjects() {
		
		int noOfSubjects=4;
		
		int averageMarks = (math +computer +science +english)/noOfSubjects;
		return averageMarks;
		
	}
	public static void main(String[] args) {
		StudentMarks obj1 = new StudentMarks();
		obj1.computer =45;
		obj1.english =41;
		obj1.math =43;
		obj1.science =70 ;
		int sum = obj1.sumOfAllSubjects();
		System.out.println("Sum of Marks: "+sum);
		
		StudentMarks obj2 = new StudentMarks();
		obj2.computer =45;
		obj2.english =41;
		obj2.math =43;
		obj2.science =70 ;
	int average = obj2.avgOfAllSubjects();
		System.out.println(average);
		
	}
	

}
