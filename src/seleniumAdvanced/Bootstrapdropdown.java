package seleniumAdvanced;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Bootstrapdropdown {

	 public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new FirefoxDriver() ;
		//open and launch url 
		
		driver.get("http://www.w3schools.com/bootstrap/bootstrap_dropdowns.asp");
		
		driver.manage().window().maximize();
		
		driver.findElement (By.id("menu1")).click();
		 
		List<WebElement> ddmenu = driver.findElements(By.xpath(".//ul[@class=dropdown-menu test]/li/a"));
		
		for(int i=0;i<=ddmenu.size();i=i++)
			
		{
			WebElement ele= ddmenu.get(i);
			
			String title = ele.getAttribute("inner html");
			
			System.out.println(title) ;
		}
	
		driver.quit();
	}
		

}
