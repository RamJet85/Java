package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class GenericVsNongeneric {

	public static void main(String[] args) {
		
		
		Employee emp = new Employee("Ram", 25, "CSE");
		Employee emp2 = new Employee("Charan", 26, "ECE");
		Employee emp3 = new Employee("King", 27, "EEE");
		
		//Array list
		
		ArrayList<Employee> obj = new ArrayList<Employee>();
		obj.add(emp);
		obj.add(emp2);
		obj.add(emp3);
		
		Iterator<Employee> it = obj.iterator();
		while(it.hasNext()){
			Employee em = it.next();
			System.out.println(em.name);
			System.out.println(em.age);
			System.out.println(em.dept);
		}
		
			

	}

}
