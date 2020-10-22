package arraysDemo;

public class Arrays {

	public static void main(String[] args) {
		
		//datatype arrayname[] = new datatype[size]
		
		int a[]= new int[5];
		a[0]=10;
		a[1]=15;
		a[2]=20;
		a[3]=25;
		a[4]=30;
		
		System.out.println(a[4]);
		
		int length= a.length;
		 //int len = a.length;
		
		System.out.println(length);
		
		//To print all the values of an array
		
		/*for(int i=0;i<length;i++){
			
			System.out.println(a[i]);
		}*/
		
		/*for (datatype variableName : arrayName) {
		  // code block to be executed
		}*/
		
		for(int i:a) {
			System.out.println(i);
		}
	}

}
