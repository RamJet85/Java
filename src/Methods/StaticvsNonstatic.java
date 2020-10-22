package Methods;

public class StaticvsNonstatic {
	
	
	 String name = "Ram"; // Non static global variable
	
	static int age = 25; // static global variable


	public static void main(String[] args) {
		
		StaticvsNonstatic st = new StaticvsNonstatic();
		
		st.Facebook();
		
		//StaticvsNonstatic.Instagram();  Class name or directly we can call static method
		
		Instagram();
		System.out.println(age);
		System.out.println(st.name);
		
			
	}
	
	public void Facebook() // Non static method by creating object
	
	{
		
		System.out.println("The facebook method");
		
		System.out.println("The name is: "+name);
	}
	
	public static void Instagram() //static method
	
	{
	
		System.out.println("The Instagram method");
		
		System.out.println("The age is: "+age);
		
	
		
	}

}
