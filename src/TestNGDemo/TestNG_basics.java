package TestNGDemo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_basics {

	//Pre conditions
	@BeforeSuite //1
	public void Setup(){
		System.out.println("Project setup with chrome browser");
		}
	@BeforeTest//2
	public void login(){
		System.out.println("Login to the site");
	}
	@BeforeClass//3
	public void launchbrowser(){
		System.out.println("Launchbrowser method");	
	}
	@BeforeMethod//4
	public void EnterUrl(){
		System.out.println("Enter the Url");
	}
	//test conditions
	@Test//5
	public void Title(){
		System.out.println("Title is printed");
	}
		
	@Test
	public void Search(){
		System.out.println("Search for the title");
	}
	
	//Post conditions
	@AfterMethod//5
	public void Logout(){
		System.out.println("Logout succesfully");
	}
	@AfterClass//6
	public void Closebrowser(){
		System.out.println("Browser got closed");
	}
	@AfterTest//7 
	public void deletecoockies(){
		System.out.println("Coockies deleted");
	}
	

}
