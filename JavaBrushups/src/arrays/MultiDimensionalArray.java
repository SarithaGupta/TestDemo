package arrays;

public class MultiDimensionalArray {

	public static void main(String[] args) {
	//Matrix kind of format. 
	/* 2  4  5 Each argument takes x axis and y axis . x axis represents row
	 * 5  6  8 and y axis represents column.
	 * 9  3  9 passing objects for both x axis and y axis is nothing but multidimensional array
	 */
		
		int a[][] = new int[3][3];
		a[0][0] = 1;
		a[0][1] = 2;
		a[0][2] = 3;//declaring and assigning values to multidimensionl array
		a[1][0] = 5;
		a[1][1] = 6;
		a[1][2] = 8;
		a[2][0] = 11;
		a[2][1] = 12;
		a[2][2] = 13;
		
		System.out.println(a[0][2]);
		
	//Simplest way of defining multi dimensional array
		int b[][] = {{17,7,32},{15,6,8},{11,12,13}};// Array will assume 0th index(row-wise)
		           // {(0,0),(0,1)(0,2)},{(1,0),(1,1),(1,2)} goes like this 
		
		System.out.println(b[0][2]);
		
		for(int i =0;i<b.length;i++) // we need 2 for loops here. one is for row and another for column.
		{                         //outer for loop stands for row.
			for(int j=0;j<b.length;j++) //inner for loop stands for column
			{
				
				System.out.print(b[i][j]);
				System.out.print("\t");				
				
			}
			
			
			System.out.println("");
			
		}
	
	}

}
