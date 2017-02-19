package seleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class geckoDriver {



public static void main(String[] args) {


System.setProperty("webdriver.gecko.driver","C:\\selenium\\geckodriver.exe");

WebDriver driver = new FirefoxDriver();

driver.get("http://www.facebook.com");

System.out.println("Application title is "+driver.getTitle());

driver.quit();

      }



}