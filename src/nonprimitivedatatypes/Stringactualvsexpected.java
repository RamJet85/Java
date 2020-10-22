package nonprimitivedatatypes;

public class Stringactualvsexpected {

	    public static void main(String[] args) {
		
		String company,office;
		
		String CEO,CTO;
		
		
		company = ("Software Solutions");
		
		office = ("SOftware Solutions");
		
		boolean test1 = company.equalsIgnoreCase(office);	
		
		System.out.println("The status is "+test1);
		
		CEO = "IT";
		CTO = "Ram";
		
		boolean test2 = CEO.equals(CTO);
		
		System.out.println("The status2 is "+test2);
		
		
		

	}

}
