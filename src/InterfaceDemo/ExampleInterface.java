package InterfaceDemo;

public class ExampleInterface implements Interface,Technical {

	public static void main(String[] args) {
		
		ExampleInterface itc = new ExampleInterface();
		
		itc.add();
		
		itc.mul();
		
		itc.sub();
		
		debit();
		
		System.out.println(Interface.a);
		
		itc.chrome();
		
		itc.firefox();
		
		itc.IE();
		
	}

	@Override
	public void add() {
		
		System.out.println("Child class interface 1 method");
		
		
	}

	@Override
	public void mul() {
		
		System.out.println("Child class interface 2 method");
		
		
	}

	@Override
	public void sub() {
		
		System.out.println("Child class interface 3 method");
	
	}
	
	public static void debit()
	{
		System.out.println("class method");
	}

	@Override
	public void chrome() {
       
		String a ="100";
		
		System.out.println(20+a);
		
		int var = Integer.parseInt(a);
		
		System.out.println("The total count is: "+(var+200));
		
	}

	@Override
	public void firefox() {
		System.out.println("Firefox method");
		
	}

	@Override
	public void IE() {
		System.out.println("IE method");
		
	}
	
	

}
