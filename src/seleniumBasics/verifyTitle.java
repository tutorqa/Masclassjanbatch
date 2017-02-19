package seleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class verifyTitle {

	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.expedia.com/");
		
		driver.manage().window().maximize();
		
		String titleofthepage=driver.getTitle();
		
		System.out.println("The page title is " + titleofthepage);	
		
		
	}

}
