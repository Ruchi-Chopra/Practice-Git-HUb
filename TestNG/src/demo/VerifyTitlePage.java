package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class VerifyTitlePage 
{
	WebDriver driver;
	@BeforeTest
	public void OpenApplication()
	{
		System.setProperty("WebDriver.chrome.driver", "Chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}
	
	
	
	@Test
	
	public void VerifyTest()
	{
		String actualTitle =driver.getTitle();
		String expectedTitle = "Facebook - Log In or Sign Up";
		Assert.assertEquals(actualTitle, expectedTitle);
	}
	
	@AfterTest
	public void CloseTest()
	{
		driver.close();
	}

}
