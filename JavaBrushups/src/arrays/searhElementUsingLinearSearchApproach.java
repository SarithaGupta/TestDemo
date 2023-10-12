package arrays;

public class searhElementUsingLinearSearchApproach {

	public static void main(String[] args) {
		
		int a[] = {34,76,89,100,25,50};
		int searchElement=a[3];
		boolean flag=false;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==searchElement)
			{
				System.out.println("Search Element Found :" +a[i]);
				flag=true;
			}
		}
		if(flag==false)
		{
			System.out.println("Search element not found");
		}

	}

}
