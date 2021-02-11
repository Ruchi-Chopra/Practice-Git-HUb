package demo;

import java.io.File;
import java.io.IOException;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Screenshot {

	WebDriver driver;
	@BeforeTest
	public void OpenApplication()
	{
		System.setProperty("webDriver.driver.chrome", "chromedriver.exe");
		driver =  new ChromeDriver();
		driver.get("http://zero.webappsecurity.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	@Test

	public void signIn() throws IOException
	{
		try{
			driver.findElement(By.id("signin_button")).click();

			driver.findElement(By.id("user_login")).sendKeys("username");
			driver.findElement(By.id("user_password")).sendKeys("password11");
			driver.findElement(By.name("submit")).click();
			driver.findElement(By.linkText("Transfer Funds")).click();
			driver.findElement(By.id("tf_amount")).sendKeys("1000");
			driver.findElement(By.id("btn_submit")).click();
			driver.findElement(By.id("btn_submit")).click();
			String actualText = driver.findElement(By.cssSelector("#transfer_funds_content > div > div > div.alert.alert-success")).getText();
			String expectedText = "You successfully submitted your transaction.";
			Assert.assertEquals(actualText, expectedText);
		}
		catch (Exception ex)
		{
			takeScreenshot();
			Assert.fail("TEst failed due to Exception"+ex);
		}
	}
	private void takeScreenshot() throws IOException {
		File ss = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(ss, new File("C:/Users/ruchi/Documents/QA Course/Selenium/Screenshots/"+(new Random().nextInt())+".jpg"));
	
			}
		
		

	
	@AfterTest

	public void CloseApplication()
	{
		driver.close();
	}
}


