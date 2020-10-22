package Constructorsdemo;

public class ThisKeyword {
	
	int x=15;
	
	public void display()
	{
		int y=20;
		System.out.println(this.x);
	}
	
	public static void main(String[] args) {
		
		ThisKeyword key = new ThisKeyword();
		key.display();
		
	}

}
