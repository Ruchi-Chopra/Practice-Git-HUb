package ruchi1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitExample {
	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("http://the-internet.herokuapp.com/");
		driver.findElement(By.linkText("Dynamic Loading")).click();
		driver.findElement(By.partialLinkText("Example")).click();
		//WebDriver
		driver.findElement(By.cssSelector("#start > button")).click();
		WebDriverWait wait = new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#finish > h4")));
		String actualText = driver.findElement(By.cssSelector("#finish > h4")).getText();
        String expectedText = "Hello World!";
        if (actualText.equals(expectedText))
        	
        {
        	System.out.println("Test Case Passed");
        }
        else {
        	System.out.println("Test Case Failed");
        }
        driver.close();
}
	

}
