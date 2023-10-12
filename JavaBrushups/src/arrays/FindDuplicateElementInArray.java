package arrays;

import java.util.HashSet;

public class FindDuplicateElementInArray {

	public static void main(String[] args) {
//Using array
		String arr[] = {"C" ,"C++" ,"Selenium","Java","Selenium","Java"};
		boolean flag =false;
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println("Duplicate element found " +arr[i]+"Index is" +i);
					flag =true;	
				
				}
			}
		}
		if(flag==false)
		{
			System.out.println("Duplicate element not found ");
		}
		
//Using Hashset
		/*HashSet<String> elements=new HashSet<>();
		boolean flag =false;
		for(String eachElement:arr)
		{
			if(elements.add(eachElement)==false)
			{
				System.out.println("Dupliate element found " +eachElement);
				flag =true;
			}
				
			//System.out.println(elements.add(eachElement));
		}
		if(flag==false)
		{
			System.out.println("Duplicate element not found ");
		}*/
	

	}

}
