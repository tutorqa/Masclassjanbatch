package seleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IEexecution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	   System.setProperty("webdriver.ie.driver","C:\\selenium\\IEDriverServer.exe");
		
		WebDriver driver=new InternetExplorerDriver();
		 
		driver.get("http://www.expedia.com");
		 		 
		driver.close();
		 
	}
	}