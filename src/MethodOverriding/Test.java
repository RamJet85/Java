package MethodOverriding;

public class Test {

	public static void main(String[] args) {
	
		
		Child cd = new Child();   
		
		cd.active();
		
		cd.greyout();
		
		cd.Inactive();
		
		cd.subchild();
		
		cd.sons();
		
		System.out.println("**********");
		
		Parent pr = new Parent();
		 
		pr.active();
		
		pr.Inactive();
		
		pr.greyout();
		
		pr.sons();
		
		System.out.println("**********");
		
		
		Parent p1 = new Child();
		
		p1.active();
		
		p1.Inactive(); 
		
		p1.greyout();
		
		p1.sons();
		
		System.out.println("**********");
		
		//Child c2 = (Child)new Parent();
		
		
		
		
		
		
		
		

	}

}
