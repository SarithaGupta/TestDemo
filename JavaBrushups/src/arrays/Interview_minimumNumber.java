package arrays;

public class Interview_minimumNumber {

	public static void main(String[] args) {
		
//I want to print the minimum number from this multi-dimensional matrix
		
		/*  24 7 32
		 *  15 6 31
		 *  11 12 10
		 */
		
		int b[][] = {{24,7,32},{15,6,31},{11,12,10}};
		int min =b[0][2];
		
		int minColumn =0;
		for(int i =0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(b[i][j]<min)
				{
					
					min=b[i][j];	//Swap it			
					minColumn = j;														
				}
																	
			}
										
		}
		System.out.println("min Value = " +min);
		
		
//InterviewQn- Print the maximum number of particular column where you got the minimum number
//Steps for this program :- 1.Find minimum number  2. Identify the particular column  3.Find the maximum number in identified column
	
		int max =b[0][minColumn];
		int k=0;
		while(k<3)
		{                            //I have only 1 iteration here. Column is fixed here.
			if(b[k][minColumn]>max)
			{
				max=b[k][minColumn];
				
			}	
			k++;
		}
		
		System.out.println("max Value = " +max);

	}

}
