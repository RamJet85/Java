package ExceptionHandling;

public class ExceptionHandling {

	public static void main(String[] args) throws InterruptedException {

		try {
		int a = 9/0;
		}
		catch (Exception e) {
			System.out.println("exception is coming...");
			e.printStackTrace();
		}
		
		System.out.println(10);
		
		Thread.sleep(1000);
	}

}
