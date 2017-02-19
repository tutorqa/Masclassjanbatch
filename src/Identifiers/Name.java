package Identifiers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Name {

	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver() ;
		
		//open and launch url 
		
		driver.get("https://www.walmart.com/account/login?returnUrl=%2Faccount");
		
		driver.manage().window().maximize();
		
		
		// Enter professional information
		
		driver.findElement (By.name("email")).sendKeys("tom@mail.com");
		
		driver.findElement (By.name("password")).sendKeys("sachin");
		
		driver.findElement (By.xpath("//button[@data-tl-id='signin-submit-btn']")).click();
		
					}

	
}