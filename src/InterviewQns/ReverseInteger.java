package InterviewQns;

public class ReverseInteger {

	public static void main(String[] args) {

		int a = 123456789;
		
		int rev =0;
		
		while(a !=0){
			
			rev = rev*10 + a % 10;
			
			a = a/10;
		}
		
		System.out.println(rev);
		
		int b = 876543210;
		
		System.out.println(new StringBuffer(String.valueOf(b)).reverse());
		
		}
	
	  

}
