package Collections;

import java.util.HashSet;

public class Setdemo {

	public static void main(String[] args) {

		
		HashSet<String> str = new HashSet<>();
		
		str.add("Ram");
		
		str.add("Selenium");
		
		str.add("web-driver");
		
		str.add("QTP");
		
		str.add("Core-Java");
		
		int setsize = str.size();
		
		System.out.println("The size of the set is "+setsize);
		
		for(String St:str)
		{
			System.out.println("The hashset list is "+St);
		}
	}

}
