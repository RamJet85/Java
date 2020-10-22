package Overloading;

public class MethodOverloading {

	public static void main(String[] args) {

		MethodOverloading ovr = new MethodOverloading();
		
		ovr.sum();
		
		ovr.sum(10);
		
		ovr.sum(10, 20);
		
		ovr.sum(12.69);
		
		Inter(5);
		
	}
	
	
	public void sum()
	{
		System.out.println("Method with zero parmeters");
		
		System.out.println("Nothing");
		
	}
	
	public void sum(int i)
	{
		System.out.println("Method with one parmeters");
		
		System.out.println("The value is: "+i);
		
	}
	
	public void sum(int j,int k)
	{
		System.out.println("Method with two parmeters");
		
		System.out.println("The sum is: " + (j+k));
		
	}
	
	public void sum(double d)
	{
		System.out.println("Method with one double parmeters");
		
		System.out.println("The value of double is: "+d);
	}
	
	public static void Inter(int l){
		System.out.println("Tear down method");
	}

}
