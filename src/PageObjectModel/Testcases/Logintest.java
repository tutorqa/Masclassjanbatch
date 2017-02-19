package PageObjectModel.Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import PageObjectModel.Pages.Loginpage;


public class Logintest 
{


@Test
public void verifyValidLogin()
{

WebDriver driver=new FirefoxDriver();

driver.manage().window().maximize();

driver.get("http://demosite.center/wordpress/wp-login.php");

Loginpage login=new Loginpage(driver);



login.clickOnLoginButton();


driver.quit();

}


}