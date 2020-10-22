package Wrapperclasses;

public class Dataconversion1 {

	public static void main(String[] args) {
		
		
		String a ="100";
		
		System.out.println(20+a);
		
		int var = Integer.parseInt(a);
		
		System.out.println("The total count is: "+(var+200));
		
		Dataconversion1 data = new Dataconversion1();
		
		data.stringtoboolean();

	}
	
	public void stringtoboolean()
	{
		String b="true";
		
		System.out.println(b);
		
		boolean bl = Boolean.parseBoolean(b);
		
		System.out.println(bl);
		
	}

}
