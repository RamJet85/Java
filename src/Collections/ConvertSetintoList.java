package Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class ConvertSetintoList {

	public static void main(String[] args) {

		
        Set<String> str = new HashSet<>();
		
		str.add("Ram");
		
		str.add("Selenium");
		
		str.add("web-driver");
		
		str.add("QTP");
		
		str.add("Core-Java");
		
		int siz = str.size();
		
		
		System.out.println("The set values are "+str);
		
		
		ArrayList<String> list = new ArrayList<>(str);
		
		System.out.println("The List values are "+list.get(4));
		
		/*for(int i=0;i<siz;i++)
		{
			System.out.println("The list of all values are "+siz);
		}*/
		
	}

}
