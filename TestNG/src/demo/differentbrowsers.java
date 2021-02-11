package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class differentbrowsers {
	WebDriver driver;
	
		@Test
		public void openBrowser()
		{
		System.setProperty("webdriver.ie.driver", "IEDriverServer.exe");
	    driver = new InternetExplorerDriver();
		driver.get("https://www.google.com/");
		}
		@Test
		public void openedgebrowser()
		{
			System.setProperty("webdriver.edge.driver", "msedgedriver.exe");
			 driver =new EdgeDriver();
			driver.get("https://www.google.com/");
			
			
			
			
			
		}
		@Test
		public void openfirefox()
		{
			System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
			driver.get("https://www.google.com/");
			
		}
		
		// TODO Auto-generated constructor stub
	}

	


