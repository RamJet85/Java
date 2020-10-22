package TestNGDemo;

import org.testng.annotations.Test;

public class TestNGfeature {
	
	
	@Test()
	public void login(){
		System.out.println("Login method");
	}
	
	@Test
	public void dashborad(){
		System.out.println("Dashboard page");
	}

}
