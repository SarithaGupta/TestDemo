package arrays;

public class missingNumberInArray {

	public static void main(String[] args) {
		
		//Array should not have duplicates.
		//Array no need to be sorted order
		//values should be in range
		int a[] = {9,6,7,5,10};
		int sum1=0;
		
		for(int i=0;i<a.length;i++)
		{
			sum1=sum1+a[i]; 
		}
		System.out.println("Sum of elements in the given array :" +sum1);
		
		int sum2 =0;
	//i want to print the first 10 numbers sum
		//for(int i=1;i<=10;i++)
		for(int i=5;i<=10;i++)
		{
			sum2 = sum2+i;
		}
		System.out.println("Sum of range of elements in the given array :" +sum2);
		System.out.println("Missing number in an array is :" +(sum2-sum1));

	}

}
