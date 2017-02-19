package seleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class firefoxexecution {
	 		
		public static void main(String[] args) {
			 
		 // Initialize browser
		
		WebDriver driver=new FirefoxDriver();
		
		 // Open expedia
		
		driver.get("http://www.expedia.com");
		
		 // Maximize browser
		
		 driver.manage().window().maximize();
		 }
	

		
	}