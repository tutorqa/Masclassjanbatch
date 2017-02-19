package TestNG;
 
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
 
public class HardandSoftAssert {
	 
      
    @Test
    public void Softassert(){
        SoftAssert Assertion=new SoftAssert();
        System.out.println("tc1 started");
        Assertion.assertEquals("Tom", "Tommy");
        System.out.println("tc1 Completed");
        Assertion.assertAll();    
    }
    
    @Test
    public void Hardassert(){
    	
    	 System.out.println("tc2 started");
         Assert.assertEquals("Tom", "Tommy");
         System.out.println("tc2 Completed");
              
    }
    
   
}
    
    
  
    

    
    
  
  