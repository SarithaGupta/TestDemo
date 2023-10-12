package arrays;

public class Interview_MaximumNumber {

	public static void main(String[] args) {
		int b[][] = {{17,7,32},{15,6,8},{11,12,13}};
		int max =b[0][0];
		for(int i =0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(b[i][j]>max)
				{
					max=b[i][j];
				}
				
			}
		}
		System.out.println("max Value = " +max);

	}
	

}
