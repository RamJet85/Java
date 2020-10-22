package arraysDemo;

public class Arraylatest {

	public static void main(String[] args) {

		//datatype arrayname[] = new datatype[size]
		// int a = 10; normal variable
		
		int a[] = new int[4];
		a[0]= 10;
		a[1]=15;
		a[2]=20;
		a[3]=25;
		System.out.println(a[2]);
		
		int length = a.length;
		System.out.println("the length of the array is "+ a.length);
		
		for(int i=0;i<length;i++) {
			System.out.println(a[i]);
		}
		System.out.println("For each started");
		//For each
		for(int i:a) {
			System.out.println(i);
		}
	}

}
