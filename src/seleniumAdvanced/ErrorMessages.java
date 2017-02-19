package seleniumAdvanced;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ErrorMessages {
	
@Test
public void TestError()
{
// Open browser� ������ ����
FirefoxDriver driver=new FirefoxDriver();

// maximize browser
driver.manage().window().maximize();

// Open URL
driver.get("https://www.fandango.com/account/signin?from=%2F");

// Click on login button
driver.findElement(By.id("ctl00_GlobalBody_SignOnControl_SignInButton")).click();

// This will capture error message
String actual_msg=driver.findElement(By.id("signin-error")).getText();


// Store message in variable
String expect="plz enter valid email";

// Here Assert is a class and assertEquals is a method which will compare two values if// both matches it will run fine but in case if does not match then if will throw an 
// Verify error message
Assert.assertEquals(actual_msg, expect);
}
}