package PageObjectModel.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Loginpage 
{

WebDriver driver;


By username=By.id("user_login");
By password=By.xpath(".//*[@id='user_pass']");
By loginButton=By.name("wp-submit");


public Loginpage(WebDriver driver)
{
this.driver=driver;
}


public void loginToWordpress(String userid,String pass)
{

driver.findElement(username).sendKeys(userid);
driver.findElement(password).sendKeys(pass);
driver.findElement(loginButton).click();

}


public void typeUserName(String uid)
{

driver.findElement(username).sendKeys(uid);
}

public void typePassword(String pass)
{

driver.findElement(password).sendKeys(pass);
}

public void clickOnLoginButton()
{
driver.findElement(loginButton).click();
}
}