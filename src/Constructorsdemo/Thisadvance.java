package Constructorsdemo;

public class Thisadvance {
	
	String name;
	
    Thisadvance(String name) {
    	
    this.name=name;		
	}
    
    void method()
    {
    	System.out.println("The constructor name is");
    	System.out.println(name);
    }

	public static void main(String[] args) {
		
		Thisadvance adv = new Thisadvance("Ram");
		adv.method();
		
		

		
		
	}

}


