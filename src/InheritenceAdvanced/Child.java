package InheritenceAdvanced;

public class Child extends Parent {


    public static void main(String[] args) {
		
		Child p1 = new Child();
		p1.add();
		p1.sub();
		p1.del();
		p1.for1();
		
			
	}
    public void del()
   
    {
	
    	System.out.println("The del is executed ");
    }
	
    public void for1()
    
    {
	
    	System.out.println("The for is executed");
    
    }
	
	
}
