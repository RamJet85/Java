package inheritence;

public class Evennumbers20 {

	public static void main(String[] args) {
    
		int limit = 20;
		
		System.out.println("Printing Even numbers between 1 and " + limit);
		
		for(int i=1; i <= limit; i++){
			
			
			if( i % 2 == 0)
			{
				System.out.print(i + " ");
			}
		}

	}
}
