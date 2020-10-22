package Concatenation;

public class String_Concate {

	public static void main(String[] args) {
		
		//string concatenation forms a new string that is the combination of multiple strings. There are two ways to concat string in java:
        
		/*By + (string concatenation) operator

         By concat() method*/

		int a =10;
		int b = 20;
		
		String s1 = "Ram";
		String s2 = "Krishna";
		
		System.out.println(a+b);
		
		System.out.println(a+s1);
		
		System.out.println(s1+s2+a+b);
		
		System.out.println(a+b+s2+s1);
		
		System.out.println(s1+s2+(a+b));
	}

}
