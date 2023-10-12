package arrays;

public class Array {
//A container which stores multiple values of same data type.There are 2 ways to declare an array
	
	
	
	public static void main(String[] args) {
//Single dimensional array
//1.Traditional way 2.Array literal method
		int a[] = new int[5];//Allocating memory first then assigning the values.
		//Declares an array and allocates memory for the values
		a[0] = 4; //initialising values to an array
		a[1] = 7;//Basically array starts from 0-th index
		a[2] = 9;
		a[3] = 13;//here actually I am allocating the memory first then  assigning the value.
		a[4] = 32;
		for(int i=0;i<a.length;i++) 
		{
			System.out.println(a[i]);
		}
		
//2.Array literal method. Mostly people follow this ,ethod to declare an array.	
		
		int b[] = {4,7,9,13,12};//Here rather than allocating the memory I am directly passing
		                        //the values to an array. This method is easy and most of the time people follow this syntax only. .
		                        //Here memory is dynamically allocating.
		                        //Array automatially takes the first argument in to the first index- means 0th index and 
		for(int i=0;i<b.length;i++) //rather than hardcoding the size , we can put array.length
		{
			System.out.println(b[i]); //retrieve the values presnt in  an array
		}

	}

}
