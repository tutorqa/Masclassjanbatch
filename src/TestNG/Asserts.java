package TestNG;
 
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
 
public class Asserts {
	 
      
    @Test
    public void tc1(){
    	
    	 System.out.println("tc1 started");
         Assert.assertEquals(123, 125,"Number of countries in the dropdown does not match");
         System.out.println("tc1 Completed");
              
    
    }
    
    @Test
    public void tc2(){

   	    System.out.println("tc2 started");
        Assert.assertEquals("State","States","Text does not match");
        System.out.println("tc2 Completed");
             
    }
    
    
    @Test
    public void tc3(){
    	
    	System.out.println("tc3 started");
    	String a="Sachin Tendulkar";
    	Assert.assertTrue(a.equalsIgnoreCase("sachin tendulkar"),"Looks to be ok ");
    	Assert.assertTrue(a.contains("Sachin"),"Looks to be ok ");
    	System.out.println("tc3 Completed");
    }
    
      
   
    }

    
  
    

    
    
  
