package automation;

public class overloadingbydatatypes {
	
	static int add (int a, int b)
	{
		return a+b;
	}
    static double add (double a, double b)
    
    {
    	return a+b;
    }
	public static void main(String[] args) {
		
		System.out.println(overloadingbyarguments.add(10, 20));
	    System.out.println(overloadingbydatatypes.add(23.6, 0.36));
		
		

	}

}
