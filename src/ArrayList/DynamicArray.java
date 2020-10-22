package ArrayList;

import java.util.ArrayList;

public class DynamicArray {

	public static void main(String[] args) {
		
		//datttype arrayname = new datatype[size];
		// Stting name = new string[];
		
		ArrayList list = new ArrayList();
		
		list.add(10);
		list.add(20);
		list.add(30);
		System.out.println(list.size());
		
		list.add(40);
		list.add(50);
		list.add("Ram");
		
		System.out.println(list.size());
		
		System.out.println(list.get(2));// get method used to get the values from the index
		
		for(int i=0;i<list.size();i++){
			
			System.out.println(list.get(i));
		}
		

	}

}
