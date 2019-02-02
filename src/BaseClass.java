import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class BaseClass {
	
	
	
	@Test
	public void Login() throws IOException {
		
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\Sachith\\eclipse-workspace_new\\GlobalParamaterTest\\src\\dataDriven.properties");
		
		prop.load(fis);
		
		
		System.out.println(prop.getProperty("username"));
		
	}
	
	
	
	
	WebDriver driver = null;
	
	@Test
	public void browserInvoke() throws IOException {
		
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\Sachith\\eclipse-workspace_new\\GlobalParamaterTest\\src\\dataDriven.properties");
		
		prop.load(fis);
			
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sachith\\Downloads\\jars for selenium\\chromedriver_win32\\chromedriver.exe");
		
		if(prop.getProperty("browser").equals("firefox")) {
			
			//WebDriver driver = new FirefoxDriver();
			driver = new FirefoxDriver();
			
		}
		else if(prop.getProperty("browser").equals("chrome")) {
			
			//WebDriver driver = new ChromeDriver();
			driver = new ChromeDriver();
			
		}
		else {
			
			//WebDriver driver = new ChromeDriver();
			driver = new ChromeDriver();
		}
		
		driver.get(prop.getProperty("url"));
		
		driver.close();
		
	}

	

}
