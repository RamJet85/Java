package arraysDemo;

public class StringArray {

	public static void main(String[] args) {

		
		//datatype arrayname[] = new datatype[size];
		
		String students[] = new String[5];
		 
		students[0]="Ram";
		students[1]="Charan";
		students[2]="Home";
		students[3]="Hyd";
		students[4]="Madhapur";
		
		System.out.println(students[4]);
		
		int length = students.length;
		System.out.println("The length of the students is "+length);
		
		
		System.out.println("For loop started");
		for(int i=0;i<length;i++) {
			System.out.println(students[i]);
		}
		
		System.out.println("For each started");
		
		for(String var:students) {
			System.out.println(var);
		}
	}

}
