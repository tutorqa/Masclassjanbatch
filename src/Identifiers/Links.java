package Identifiers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Links {


	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver() ;
		
		//open and launch url 
		
		driver.get("http://www.facebook.com");
		
		driver.manage().window().maximize();
			
		driver.findElement (By.linkText("Forgot account?")).click();
		
		driver.findElement (By.partialLinkText("I can't identify ")).click();
		
				
	}

	
}