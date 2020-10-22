package automation;

public class Newprogram {
	
	public static void main(String[] args) {
		//int n = Integer.parseInt(args[0]);
		int x = 10;     
        int y = 20;
        int result = x + y;
         System.out.println("x + y = " + result);
         result = x - y;
         System.out.println("x - y = " + result);
         result = x * y;
         System.out.println("x * y = " + result);
         result = y / x;
         System.out.println("y / x = " + result);
         result = x % 3;
         System.out.println("x % 3 = " + result);
         //The addition operator (+) can also be used for joining two or more strings together
         String firstName = "Ramakrishna";
         String lastName = "Perabathula";
                  int a, b, size = 15; //HEART 
		    for (a = size / 2; a <= size; a = a + 2) {
            for (b = 1; b < size - a; b = b + 2)
		        System.out.print(" ");
		    for (b = 1; b <= a; b++)
		        System.out.print("A");
		    for (b = 1; b <= size - a; b++)
		        System.out.print(" ");
 	    for (b = 1; b <= a - 1; b++)
		        System.out.print("A");
		    System.out.print("\n");
		    }
		    for (a = size; a >= 0; a--) {
         	for (b = a; b < size; b++)
		        System.out.print(" ");
		    for (b = 1; b <= ((a * 2) - 1); b++)
		        System.out.print("V");

		    System.out.print("\n");
		     }
                    String greeting = "Hello my dear  " + firstName + "\n " + lastName;
		    System.out.println(greeting);
        
         }

}
