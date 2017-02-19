package seleniumAdvanced;

import org.openqa.jetty.html.List;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Links {
	
	public static void main(String[] args) throws InterruptedException {
					
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		    		    
		//open and launch url 
		
		    driver.get("https://www.google.com");
		
		    driver.manage().window().maximize();
				    	    		   		    
		   java.util.List<WebElement> links= driver.findElements(By.tagName("a"));
		   
		   System.out.println(links.size());
		    
	}
}
