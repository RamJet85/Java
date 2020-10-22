package nonprimitivedatatypes;

public class String_Split {

	public static void main(String[] args) {

      
		String name = "Ram Charan Rangasthalam Big fan of charan";
		int length = name.length();
		System.out.println("The length is "+length);
		
		String split[] = name.split(" ");
		
		for(int i=0;i<split.length;i++)
		{
			System.out.println("The value is: "+split[i]);
		}
				
	}

}
