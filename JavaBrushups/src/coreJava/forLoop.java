package coreJava;

public class forLoop {

	public static void main(String[] args) {
		/*int k=1;
		for(int i=0;i<4;i++)
		{
			
			for(int j=1;j<=4-i;j++)
			{				
					System.out.print(k);
					System.out.print("\t");
					k++;
				}
			System.out.println("\n");
			}
		
		}*/
		
		System.out.println("***************************");
		
	/*int k=1;
	for(int i=0;i<4;i++)
	{
		
		for(int j=0;j<=i;j++)
		{				
				System.out.print(k);
				System.out.print("\t");
				k++;
			}
		System.out.println("\n");
		}*/
		
	/*	System.out.println("***************************");
		
		for(int i=1;i<5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
				System.out.print("\t");
			}
			System.out.println("\n");
		}*/
	
		System.out.println("***************************");
		int k=1;
		for(int i=1;i<4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				
					System.out.print(k*3);
					System.out.print("\t");
					k=k+1;
				
			}
			System.out.println("");	
		}
	}

	}


