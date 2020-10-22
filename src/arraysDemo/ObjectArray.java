package arraysDemo;

public class ObjectArray {

	public static void main(String[] args) {
		// By using object array we can store different data type values, Object is a super class
		
		Object obj[]=new Object[5];
		
		obj[0]="Ram";
		obj[1]=10;
		obj[2]=12.95;
		obj[3]='R';
		obj[4]="29/09/1993";
		
		System.out.println(obj[4]);
		
		System.out.println(obj.length);
		
		//To print all the array values by using for loop
		
		for(int i=0;i<obj.length;i++){
			System.out.println("The value of object array is: "+obj[i]);
		}
		

	}

}
