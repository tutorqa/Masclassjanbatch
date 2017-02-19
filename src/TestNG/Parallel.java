package TestNG;
 
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
 
public class Parallel {
	 
      
    @Test
    public void tc1(){
        
        System.out.println("tc1 done");
        Reporter.log("Test is executed via Thread and Thread Id is "+Thread.currentThread().getId(), true);
    }
    
    @Test
    public void tc2(){
    	
        System.out.println("tc2 done");
        Reporter.log("Test is executed via Thread and Thread Id is "+Thread.currentThread().getId(), true);
    }
    
    
    @Test
    public void tc3(){
    	
        System.out.println("tc3 done");
        Reporter.log("Test is executed via Thread and Thread Id is "+Thread.currentThread().getId(), true);
    }
    
    @Test
    public void tc4(){
    	
        System.out.println("tc4 done");
        Reporter.log("Test is executed via Thread and Thread Id is "+Thread.currentThread().getId(), true);
    }
    
    
    @Test
    public void tc5(){
    	
        System.out.println("tc5 done");
        Reporter.log("Test is executed via Thread and Thread Id is "+Thread.currentThread().getId(), true);
    }
    
    
    @Test
    public void tc6(){
    	
        System.out.println("tc6 done");
        Reporter.log("Test is executed via Thread and Thread Id is "+Thread.currentThread().getId(), true);
    }
    
    @Test
    public void tc7(){

    System.out.println("tc7 done");
    Reporter.log("Test is executed via Thread and Thread Id is "+Thread.currentThread().getId(), true);
    }
}