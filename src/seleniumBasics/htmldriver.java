package seleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class htmldriver {

public static void main(String[] args) throws InterruptedException {

// Declaring and initialize  HtmlUnitWebDriver
WebDriver driver = new HtmlUnitDriver();

// open facebook webpage
driver.get("http://www.facebook.com");

// Print the title
System.out.println("Title of the page "+ driver.getTitle());

}}