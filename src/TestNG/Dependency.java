package TestNG;


import org.testng.annotations.Test;

public class Dependency {

@Test
public void testLogin()
{

System.out.println("login done");

}

@Test(dependsOnMethods={"testLogin"})
public void searchAccount()
{
System.out.println("search Account ");

}

@Test(dependsOnMethods={"testLogin","searchAccount"})
public void testLogout()
{
System.out.println("logout");

}

}