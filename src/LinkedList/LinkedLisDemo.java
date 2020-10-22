package LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedLisDemo {

	public static void main(String[] args) {
		
		
		LinkedList<String> list = new LinkedList<String>();
		
		list.add("Selenium");
		
		list.add("Manual Testing");
		
		list.add("Web Driver");
		
		list.add("Test NG");
		
		System.out.println("The linkedlist contents are: "+list);
		
		//Add first
		
		list.addFirst("Smoke Testing");
		
		list.addLast("Regression Testing");
		
		
		System.out.println("The linkedlist contents are: "+list);
		
		System.out.println(list.get(4));
		
		list.set(5, "Objects");
		
		System.out.println("The linkedlist contents are: "+list);
		
		list.removeFirst();
		
		list.removeLast();
		
		System.out.println("The linkedlist contents are: "+list);
		
		//Using for loop
		
		System.out.println("***Using for loop***");
		
		for(int n=0;n<list.size();n++)
		{
			System.out.println("The list is: "+list.get(n));
		}
		
		//Using for each
		
		System.out.println("***Using for each***");
		
		for(String str : list)
		{
			System.out.println("The list of data is: "+ (str));
		}
		
		//Using Iterator
		
		System.out.println("***using Iterator***");
		
		Iterator<String> itr = list.iterator();
		
		while(itr.hasNext())
		{
			System.out.println("The list of values are: "+itr.next());
			
		}

		//Using while loop
		
		System.out.println("***Using while loop***");
		
		int num =0;
		
		while(list.size()>num)
		{
			System.out.println("The list of values are: "+list.get(num));
			
			num ++;
			
		}

	}

}
