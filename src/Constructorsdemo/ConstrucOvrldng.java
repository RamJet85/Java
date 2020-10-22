package Constructorsdemo;

public class ConstrucOvrldng {
	
	String name; // instance vars
	
    int age; // instance vars

	public static void main(String[] args) {   
		
		//can we overload the constructor yes we can over load
		
		// this keyword is used when we have intilaize c
		
		ConstrucOvrldng od = new ConstrucOvrldng();
		
		ConstrucOvrldng od1 = new ConstrucOvrldng(10);
		
		ConstrucOvrldng od2 = new ConstrucOvrldng(20, 30);
		
		ConstrucOvrldng od3 = new ConstrucOvrldng("Ram", 25);
		
		System.out.println(od3.name);
		
		System.out.println(od3.age);
			
	}
	
	public ConstrucOvrldng()
	{
		System.out.println("Zero parm constructor");
	}
	
	public ConstrucOvrldng(int i)
	{
		System.out.println("one parm constructor");
		
		System.out.println(i);
	}
	
	public ConstrucOvrldng(int a, int b)
	{
		System.out.println("two parm constructor");
		
		System.out.println(a+b);
	}
	
	public ConstrucOvrldng(String name, int age) // this means current class
	{
	
		System.out.println("This keyword");
		
		this.name =name; //  this.class var = loca var this = current class
		 
		this.age = age; //  this.class var = loca var
		
		
		
	}

}
