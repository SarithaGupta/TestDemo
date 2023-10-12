package arrays;

public class javaArray {

	public static void main(String[] args) {
		int num = 5; //This num variable stores only one integer value that is 5.
		int[] arr = new int[5]; // this arr variable holds 5 integer values. here we didnt declare the values inside the variable .
		//'new' keyword is used for memory allocation for this array.
		 arr[0] = 1;
		 arr[1] = 3;
		 arr[2] = 4;
		 arr[3] = 5;
		 arr[4] = 6;
		 //or We can declare and initialize like the below
		 
		 int[] arr2 = {1,3,4,5,6};
		 System.out.println(arr2[0]);
		 System.out.println("**********************");
		 //for loop
		 for(int i=0;i<arr2.length;i++)
		 {
			 System.out.println(arr2[i]);
		 }
		 System.out.println("**********************");
		 //array of string 
		 String[] name = {"Saritha", "Diya", "Aadhidev"};
		 for(int i =0;i<name.length;i++)
		 {
			 System.out.println(name[i]);
		 }
		 System.out.println("**********************");
		 //enhanced for loop of this 
		 for(String s : name)
		 {
			 System.out.println(s);
		 }
		

	}

}
