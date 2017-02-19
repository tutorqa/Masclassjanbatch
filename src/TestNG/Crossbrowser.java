package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
 
public class Crossbrowser {
 
@Test
 
// Here this parameters we will take from testng.xml
@Parameters("Browser")
public  void test1(String browser) {
 
if(browser.equalsIgnoreCase("FF")){
 
WebDriver driver=new FirefoxDriver();
 
driver.manage().window().maximize();
 
driver.get("http://www.facebook.com");
 
driver.quit();
 
}
 if(browser.equalsIgnoreCase("IE")){
 
System.setProperty("webdriver.ie.driver", "C:\\selenium\\IEDriverServer.exe");
 
WebDriver driver=new InternetExplorerDriver();
 
driver.manage().window().maximize();
 
driver.get("http://www.facebook.com");
 
driver.quit();
}

else if(browser.equalsIgnoreCase("Chrome")){
	 
System.setProperty("webdriver.ie.driver", "C:\\selenium\\chromedriver.exe");
 
WebDriver driver=new InternetExplorerDriver();
 
driver.manage().window().maximize();
 
driver.get("http://www.facebook.com");
 
driver.quit();
}
}
 
}