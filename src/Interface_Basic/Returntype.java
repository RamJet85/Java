package Interface_Basic;

public class Returntype {

	public static void main(String[] args) {
		
		Returntype type = new Returntype();
		
		type.test();
		
		int in= type.test1();
		
		System.out.println(in);
		
		String str = type.test2();
		
		System.out.println(str);

	}
	
	public void test(){
		System.out.println("test method");
	}
	
	public int test1(){
		int a = 10;
		int b = 20;
		
		int c = a+b;
		return c;
		
	}
	public String test2(){
		String a ="Ram";
		
		return a;
	}
}
