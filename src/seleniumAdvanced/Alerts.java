package seleniumAdvanced;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Alerts {

@Test
public void TestAL() throws InterruptedException{

// Load Fire fox browser

 WebDriver driver=new FirefoxDriver();

// Open login

driver.get("https://infinity.icicibank.com/corp/AuthenticationController?FORMSGROUP_ID__=AuthenticationFG&__START_TRAN_FLAG__=Y&FG_BUTTONS__=LOAD&ACTION.LOAD=Y&AuthenticationFG.LOGIN_FLAG=1&BANK_ID=ICI&_ga=1.32059198.1823612197.1485441628");

// Maximize the window

driver.manage().window().maximize();

// Click on Search Availability Service button

 driver.findElement(By.xpath("..//*[@id='VALIDATE_CREDENTIALS1']")).click();

// Switch to alert window and capture the text and print

 //Alert alert=driver.switchTo().alert();

 
System.out.println(driver.switchTo().alert().getText());

// Pause testcase for 5 second

Thread.sleep(5000);

// click on ok button

driver.switchTo().alert().accept();

// Close browser

 driver.quit();
}
}
