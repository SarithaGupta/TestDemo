package coreJava;
//multiple methods have same name . 
//how can you differentiate that ?ans is below
//either argument count should be different or
//argument data type should be different

//Eg real time ---- getpayment method ,one argument as credit card as an argument,debit ard as an another argument,gift card as an other argument 
//Ecommerce website --add to cart functionality --same getpayment() method only , but we are passing different kind of arguments
public class FunctionOverloading {
	
	public void getData(int a)
	{
		System.out.println(a);
		
	}
	public void getData(String a)
	{
		System.out.println(a);
		
	}
	public void getData(int a, int b)
	{
		System.out.println(a+","+b);
		
	}

	public static void main(String[] args) {
		FunctionOverloading ol = new  FunctionOverloading();
		ol.getData(2);
		ol.getData(3, 6);
		ol.getData("Hello");

	}

}
