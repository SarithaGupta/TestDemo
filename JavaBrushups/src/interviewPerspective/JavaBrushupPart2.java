package interviewPerspective;

import java.util.ArrayList; // package .Eah package is having hundreads of classes.
import java.util.Arrays;
import java.util.List;
//Arraylist class is coming from this package.

public class JavaBrushupPart2 {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,8,34,21,56,67,100,103,122};// We cannot add more values in between.
		//Print only the values which are multiples of 2 in the above array
		for(int num :arr)
		{
		if(num%2 == 0)
		{
			System.out.println(num);
			//break;  //check if array has multiple of 2(We can add break 
		}
		else
		{
			System.out.println(num +" is not a multiple of 2");
		}

		}
	
	//dynamically we are creating the array and increse the size .
	ArrayList<String> a = new ArrayList<String>();
	//or
	
	//List<String> a = new ArrayList<String>();// Here i am creating the object of an arraylist 
	
	//Through that we can access all the methods of Arraylist class 
	//Arraylist is one of the class in java.
	//In this class you have lot of methods . using the object we can access every methods.
    a.add("Smitha");
    a.add("Ravi");
    a.add("Nakul");
    a.add("Rahul");
    for(int i =0 ;i<a.size();i++)
    {
    	System.out.println(a.get(i));
    }
    System.out.println("###########################");
    //enhanced for loop to print the values in arraylist
    for(String name :a)
    {
    	System.out.println(name);
    }
    //Check the name nakul is present or not
    System.out.println(a.contains("Nakul"));
    System.out.println(a.contains("nakul"));
    System.out.println("###########################");
    System.out.println(a.get(2));
    System.out.println(a.remove(3));
    //converting Traditional array to arraylist
    String[] name = {"Saritha", "Diya", "Aadhidev"};
    
    List<String> nameArrayList = Arrays.asList(name);
    System.out.println(nameArrayList.contains("Diya"));
	}
}
