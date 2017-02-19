package seleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chromeexecution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver.exe" );
		
		WebDriver driver=new ChromeDriver();
		 
		driver.get("http://www.expedia.com");
		
		driver.manage().window().maximize();
		 		 
		driver.close();
		 
	}
	}