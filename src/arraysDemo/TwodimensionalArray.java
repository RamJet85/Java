package arraysDemo;

public class TwodimensionalArray {

	public static void main(String[] args) {

		
		String Empname[][] = new String[5][4];
		
		Empname[0][0]="Ravi";
		
		Empname[0][1]="Ram";
		
		Empname[0][2]="QA";
		
		Empname[0][3]="automation";
		
		Empname[1][0]="Charan";
		
		Empname[1][1]="Nani";
		
		Empname[1][2]="Module-Lead";
		
		Empname[1][3]="QA-Lead";
		
		Empname[2][0]="Charan12";
				
		Empname[2][1] ="RK";
		
		Empname[2][2]="Lead";
		
		Empname[2][3]="CEO";
		
		Empname[3][0] ="Madasu-Abhinav";
		
		Empname[3][1] ="Abhinav1";
		
		Empname[3][2] ="Abhinav2";
		
		Empname[3][3] ="Abhinav3";
		
        Empname[4][0] ="Prawn's";
		
		Empname[4][1] ="Prawn's 1";
		
		Empname[4][2] ="Prawn's 2";
		
		Empname[4][3] ="Prawn's 3";
		
		
		
		System.out.println("The array name is "+Empname[1][1]);
		
	int lenrows = Empname.length;
	System.out.println("The no of rows are "+lenrows);
	
	int lencols = Empname[0].length;
	System.out.println("the no of cols are "+lencols);
	
	for(int rows=0;rows<lenrows;rows++) {
		for (int cols=0;cols<lencols;cols++) {
			System.out.println("The total array's are "+Empname[rows][cols]);
		}
	}
		
		
			
		}
		
	}


