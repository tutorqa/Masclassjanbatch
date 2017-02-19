package seleniumAdvanced;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboard {

public static void main(String[] args) {


WebDriver driver=new FirefoxDriver();

driver.get("https://www.google.com");

driver.manage().window().maximize();

Actions act=new Actions(driver);

act.contextClick(driver.findElement(By.linkText("gmail"))).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();

}

}