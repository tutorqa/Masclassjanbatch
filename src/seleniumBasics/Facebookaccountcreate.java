package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Facebookaccountcreate {


	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new FirefoxDriver() ;
		
		//open and launch url 
		
		driver.get("http://www.facebook.com");
		
		driver.manage().window().maximize();
		
		// Add 5 seconds wait
		Thread.sleep(10000);
		
		
		// Enter professional information
		
		driver.findElement (By.name("firstname")).sendKeys("anandssd");
		
		driver.findElement (By.name("lastname")).sendKeys("sachinwde");
		
		
	}

	
}