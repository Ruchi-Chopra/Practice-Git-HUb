package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MultipleValidations2 {
	WebDriver driver;
@BeforeTest
public void OpenApplication() {
	System.setProperty("webDriver.driver.chrome", "chromedriver.exe");
	driver =  new ChromeDriver();
	driver.get("https://www.monsterindia.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
}
@Test(priority=0)
public void VerifyTitle()
{
	String actualTitle = driver.getTitle();
	String expectedTitle = "Job Vacancy - Latest Job Openings - Job Search Online - Monster India";;
	Assert.assertEquals(actualTitle, expectedTitle);
	
}
@Test(priority=1)	
	public void VerifyText()
	{
	String actualText =driver.findElement(By.cssSelector("#user-signup-actions > div:nth-child(1) > div > h2")).getText();
	String expectedText = "NEW TO MONSTER?";
	Assert.assertEquals(actualText, expectedText);
	}
	

@Test(priority=2)
public void VerifySignIn()
{
	Boolean signIn = driver.findElement(By.cssSelector("#seekerLoginBtn > a > span:nth-child(2")).isDisplayed();
	Assert.assertTrue(signIn);
			
}
@Test(priority=3)
public void VerifySearchbutton()
{
	Boolean SearchButtonEnabled = driver.findElement(By.cssSelector("#searchForm > div > div.col-xl-2.col-lg-3.col-sm-2.col-xxs-12.fl.no-padding > input")).isEnabled();
	Assert.assertTrue(SearchButtonEnabled);
}

@AfterTest
public void CloseApplication() {
	driver.close();
}

}



