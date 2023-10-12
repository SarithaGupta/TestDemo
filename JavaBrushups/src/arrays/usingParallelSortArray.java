package arrays;

import java.util.Arrays;
import java.util.Collections;

public class usingParallelSortArray {

	public static void main(String[] args) {
//Using built-in methods
	//Approach 1
		/*int a[] = {52,23,10,56,24,17,6};
		System.out.println("Array before sorting " +Arrays.toString(a));
		Arrays.parallelSort(a);
		
		System.out.println("Array after sorting " +Arrays.toString(a));*/
		
	// Appoach 2 
		/*int a[] = {52,23,10,56,24,17,6};
		System.out.println("Array before sorting " +Arrays.toString(a));
		Arrays.sort(a);
		System.out.println("Array after sorting " +Arrays.toString(a));*/
		
		
	//I want to print the array in reverse order/Descending order
	//By default Array sorting in ascrnding order only
		Integer a[] = {52,23,10,56,24,17,6}; //Here colletions.reverseorder method will not support premitive type.it supports Integer type
		System.out.println("Array before sorting " +Arrays.toString(a));
		Arrays.sort(a,Collections.reverseOrder());
		
		System.out.println("Array after sorting " +Arrays.toString(a));
		

	}
	
	

}
