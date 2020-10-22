package InterviewQns;

public class ReverseString {

	public static void main(String[] args) {
		
		String str = "Automation testing";
		
		StringBuffer buffer = new StringBuffer(str);
		
		buffer.reverse();
		
		System.out.println("The reverse string is "+buffer);
		
		
	}

}
