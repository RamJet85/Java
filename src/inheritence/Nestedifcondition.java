package inheritence;

public class Nestedifcondition {

	public static void main(String[] args) {
		int num1 = 3, num2 = 1, num3 = 5;
		if(num1 >= num2) {
			
			  if(num1 >= num3)
				  System.out.println(num1+" is the largest Number");
			  else
				  System.out.println(num3+" is the largest Number");
	      } 
	      else 
	      {
				
		  if(num2 >= num3)
			  System.out.println(num2+" is the largest Number");
		  else
			  System.out.println(num3+" is the largest Number");
	      }
	   }
	

	}


