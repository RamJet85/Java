package Read_Properies;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ReadPropertiesfile {
	
	static WebDriver driver;

	public static void main(String[] args) throws IOException {
		
		Properties prop = new Properties();
		
		FileInputStream fis = new FileInputStream("D:\\Automation\\Myprogram\\src\\Read_Properies\\config.properties");
		
		prop.load(fis);
		
		System.out.println(prop.getProperty("browser"));
		
		String Browsername = prop.getProperty("browser");
		
		if(prop.getProperty("browser").equals("chrome")){
			
			System.setProperty("webdriver.chrome.driver","D:\\BrowserServers\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			}
		
		else if(prop.getProperty("browser").equals("chrome")){
			driver = new FirefoxDriver();
			
		}

		else {
			System.out.println("No browser");
		}
		
	}

}
