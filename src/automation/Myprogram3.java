package automation;

public class Myprogram3 {

	public static void main(String[] args) {
		
		int x=3;
		int y=9;
		x=x+5;
		if(x!=y-6)
		{
			y=y+6;
			x=x-y;
			y=x-y;
		}
		else
		{
			x=x+y;
			System.out.println(x+2);
			
		}
		System.out.println(y+2);
		System.out.println(x);
		System.out.println(y);
	}
	

}
