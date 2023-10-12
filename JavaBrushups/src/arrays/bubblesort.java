package arrays;

import java.util.Arrays;

public class bubblesort {

	public static void main(String[] args) {
		int a[] = {17,67,13,36,20,74};
		System.out.println("Array before sorting " +Arrays.toString(a));
		String b=  Arrays.toString(a);
		System.out.println(b);
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if (a[i]>a[j])         //17 64 13 36 20 74
				{                      //13 67 17 36 20 74
					int k =a[j];
					a[j]=a[i];
					a[i] =k;
				}
			}
		}
		System.out.println("Array after sorting " +Arrays.toString(a));

	}

}
