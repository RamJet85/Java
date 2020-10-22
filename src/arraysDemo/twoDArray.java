package arraysDemo;

public class twoDArray {

	public static void main(String[] args) {


		
		String Employee[][] = new String[2][4];
		
		Employee[0][0]="Ram";
		
		Employee[0][1]="Abhi";
		
		Employee[0][2]="Ram1";
		
		Employee[0][3]="Ram2";
		
		Employee[1][0]="Ram3";
		
		Employee[1][1]="Ram4";
		
		Employee[1][2]="Ram5";
		
		Employee[1][3]="Ram6";
		
		System.out.println("The length is: "+Employee.length);
		
		System.out.println("The columns are "+Employee[0].length);
		
		System.out.println("The name is: "+Employee[1][1]);
		
		
		for(int i=0;i<Employee.length;i++)
			
		{
			for(int j=0;j<Employee.length+2;j++)
			{
				System.out.println("The employe is: "+Employee[i][j]);
			}
		}
		

	}

}
