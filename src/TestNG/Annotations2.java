
package TestNG;
 
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
 
public class Annotations2 {
	       
    
    @BeforeSuite
    public void Clearingcache(){
        
        System.out.println("launch files");
    
    }
    
    @AfterSuite
    public void ClosingBrowser(){
        
        System.out.println("delete files");
    
    }
}
    
    
  
    

    
    
  
