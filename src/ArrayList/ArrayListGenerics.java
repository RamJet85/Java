package ArrayList;

import java.util.ArrayList;

public class ArrayListGenerics {

	public static void main(String[] args) {
		
		
		ArrayList<Integer> array = new ArrayList<Integer>();
		
		array.add(25);
		
		array.add(85);
		
		ArrayList<String> array1 = new ArrayList<String>();
		
		array1.add("Ram");
		
		array1.add("Abhi");
		
		array1.add("Siri");
		
		
		System.out.println("The size is: "+(array1.size()));
		
		//Adding all methods 
        
        ArrayList<String> array2 = new ArrayList<String>();
		
		array1.add("Ram1");
		
		array1.add("Abhi1");
		
		array1.add("Siri1");
		
		array1.addAll(array2);
		
		for(int i=0;i<array1.size();i++)
		{
			System.out.println("The total values are: "+array1.get(i));
		}
		
	
		System.out.println("*********************");
		
    
	}
	}


