package Methods;

public class MethodsorFunctions {

	public static void main(String[] args) {
		
		MethodsorFunctions Mf = new MethodsorFunctions();
		
		int integer = Mf.test();
		
		System.out.println("The C value is: "+integer);
		
		String name = Mf.Pass();
		
		System.out.println("The name is: "+name);
		
		int div = Mf.division(20, 5);
		
		System.out.println("The division value is: "+div);
	
	}

	
	public int test()
	{
		int a=10;
		int b=20;
		int c =a+b;
		return c;
	}
	
	public String Pass()
	{
		String s ="Selenium";
		return s;
	}
	
	public int division(int x,int y)
	{
		int d =x/y;
		
		return d;
		
		
		
	}
	
}
