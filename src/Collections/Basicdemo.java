package Collections;

import java.util.ArrayList;

public class Basicdemo {

	public static void main(String[] args) {


		ArrayList obj1 = new ArrayList();
		
	    obj1.add(8754555);
	    
	    obj1.add("Ram");
	    
	    obj1.add('M');
	    
	    obj1.add(4);
	    
	    obj1.add(12.85);
	    
	    obj1.add("Ram");
	    
	    
	    
	    System.out.println("The size is: "+(obj1.size()));
	    
	    /*int str = obj1.size();
	    
	    System.out.println("the size of an array list is "+str);*/
	    
	    for(int i=0;i<obj1.size();i++)
	    {
	    	 System.out.println("The index is "+ obj1.get(i));
	    }
	    
	   //System.out.println("The total sizes are "+obj1);
	    
	   
	    
	    
	    
	}

}
