package arraysDemo;

public class Arraydemotogetlistofvalues {

	public static void main(String[] args) {

        String studentnames[] = new String[5];
		
		studentnames[0] = "Ram";
		
		studentnames[1] = "Pavan";
		
		studentnames[2] = "Abhinav";
		
		studentnames[3] = "Kola";
		
		studentnames[4] = "Sayila";
		
		int str = studentnames.length;
		
		System.out.println("The length of the name is "+str);
		
		for(int i=0;i<str;i++)
		{
			System.out.println("The student name is "+studentnames[i]);
		}
			
	}

}
