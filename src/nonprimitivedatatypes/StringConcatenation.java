package nonprimitivedatatypes;

import org.testng.annotations.Test;

public class StringConcatenation {
	
	@Test(priority =1)
	public void StringcontatByusingPlus()
	{
		String firstname ="Ram";
		
		String lastname = "Krishna";
		
		
		//Println stattement will give a new line space--> ln means line new
		
		//By using plus (+) operator
		
		String fullname = firstname + lastname;
		
		System.out.println(fullname);
	}
			
	//By using concat method
	    @Test (priority =2)
		public void StringBYConcat() {
	    
	    	String firstname ="Ram";
			
			String lastname = "Krishna";
			
			String fullname1 = firstname.concat(lastname);
			
			System.out.println(fullname1);
	    		
		}
				
	}

