package Identifiers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Id {


	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver() ;
		
		//open and launch url 
		
		driver.get("https://www.kohls.com/myaccount/kohls_login.jsp");
		
		driver.manage().window().maximize();
		
		// Enter professional information
		
		driver.findElement (By.id("kiosk_loginEmail")).sendKeys("tom1@gmail.com");
		
		driver.findElement (By.id("kiosk_loginPassword")).sendKeys("sachin");
		
	
		driver.findElement (By.xpath("//input[@class='rd-signInBtn textWhite rd-btnGreen mT20 kas-loginPage-signin-button-SignIn']")).click();
				
		
	}

	
}