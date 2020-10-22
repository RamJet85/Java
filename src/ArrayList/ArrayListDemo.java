package ArrayList;

import java.util.ArrayList;

public class ArrayListDemo{

	public static void main(String[] args) {
		
		//datatype arrayname[]=new array[size]

		
		ArrayList<Object> list = new ArrayList<Object>();
		
		list.add("Ram");
		
		list.add('M');
		
		list.add(45);
		
		list.add(12.96);
		list.add(null);
		
		list.add(true);
		
		System.out.println("The size is: "+(list.size()));
		
		System.out.println("The value is: "+(list.get(2)));
		
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
		}
		
		
	
		
	}

}
