package seleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;

public class Phanthomjs {

	public static void main(String[] args) {
	
					
				System.setProperty("phantomjs.binary.path", "C:\\selenium\\phantomjs-2.1.1-windows\\bin\\phantomjs.exe");
				
			    WebDriver driver=new PhantomJSDriver();
			    driver.get("http://wwww.facebook.com");
			   	System.out.println(driver.getTitle());
			

		}
	}	