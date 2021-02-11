package ruchi1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyLogIN {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("ironman123@rediffmail.com");
		driver.findElement(By.id("pass")).sendKeys("1234");
		driver.findElement(By.name("login")).click();
		String actualErrorMsg = driver.findElement(By.cssSelector("#email_container > div._9ay7")).getText();
		
String ExpectedErrorMsg = "The email you’ve entered doesn’t match any account. Sign up for an account.";
if (actualErrorMsg.equals(ExpectedErrorMsg))
		{
	System.out.println("Pass Test");
	
		}
else { 
System.out.println("Fail Test");
}	
	
}

}
