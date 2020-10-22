package arraysDemo;

public class Booleanarray {

	public static void main(String[] args) {
         
		boolean TF[] = new boolean[5];
		
		TF[0] = 4<5;
		TF[1] = 5>4;
		TF[2] = 5>9;
		TF[3] = 5>-4;
		TF[4] = 15<4;
		
		System.out.println("The correct value of "+TF[2]);
		
		int integer = TF.length;
		
		System.out.println("The length of the array is "+integer);
		
		for(int i=0;i<integer;i++)
		{
			System.out.println("The correct value is "+TF[i]);
		}
	}

}
