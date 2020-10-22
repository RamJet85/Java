package arraysDemo;

public class Longarray {

	public static void main(String[] args) {

		//datatype arrayname[][] = new datatype[rows][columns];
		
				long name[][] = new long[2][3];
				
				name[0][0]=  845454545;
				name[0][1] = 966574559;
				name[1][0] = 778596655;
				name[1][1] = 666696655;
			
				
				int ln = name.length;
				
				
				System.out.println("The length is "+ln);
				
				System.out.println("The count of the name is "+name[0][1]);
				
				for(int i=0;i<ln;i++)
				{
					for(int j=0;j<ln;j++)
					{
						System.out.println("The count is "+name[i][j]);
					}
					
					
					
				}
	}

}
