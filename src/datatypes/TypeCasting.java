package datatypes;

public class TypeCasting {

	public static void main(String[] args) {

		
		// assigning a value of one primitive data type to another data type
		
		// Top casting automatically converts
		
		int a = 10;
		
		double d =  a;
		
		System.out.println(a);
		System.out.println(d);
		
		// Down casting manually converts
		
		double mydouble = 12.34;
		int t =  (int) mydouble;
		
		System.out.println(mydouble);
		System.out.println(t);
		
	}

}
