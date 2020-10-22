package Variables;

public class LocalandGlobal {
	
	//Global or instance variables
	
	String name = "Ram";
	
	int age = 10;

	public static void main(String[] args) {
		
		LocalandGlobal var = new LocalandGlobal();
		
		System.out.println(var.name);
		
		System.out.println(var.age);
		
		var.sum();	
	}
	
	public void sum()
	{
		
		int a = 15;
		
		int age;
		
		age = 20;
		
		System.out.println(a);
		System.out.println(age);
	}

}
