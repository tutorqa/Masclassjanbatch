package TestNG;

 
import org.testng.annotations.Test;
 
public class Disabling {
 
@Test
public void testtc1(){
 
System.out.println("tc1");
}
 
@Test(enabled=false)
public void testtc2(){
 
System.out.println("tc2");
}
 
@Test
public void testtc3(){
 
System.out.println("tc3");
}
 
}
