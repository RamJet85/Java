package arraysDemo;

public class Singlearraydemo {

	public static void main(String[] args) {
		
		//datatype arrayname[] = new datatype[size];

		String studentnames[] = new String[5];
		
		studentnames[0] = "Ram";
		
		studentnames[1] = "Pavan";
		
		studentnames[2] = "Abhinav";
		
		studentnames[3] = "Kola";
		
		studentnames[4] = "Sayila";
		
		int len = studentnames.length;
		
		System.out.println("The length of the array is "+len);
		
		System.out.println("Student name is "+studentnames[0]);
		
		/*for(int i=0;i<len;i++)
		{
			System.out.println("The total array list is "+studentnames[i]);
		}*/
		
		for(String i:studentnames){
			
			System.out.println("The total array list is "+i);
		}
		
	}

}
