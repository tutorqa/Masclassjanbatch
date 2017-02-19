package javaClassandObjects;

public class JavaClassdemo {
	
	 int Rahul=10;
     int sachin=12;

	public static void main(String[] args)
	
	{
	 System.out.println("program started");
     JavaClassdemo obj1=new JavaClassdemo() ;
     obj1.sum();
     System.out.println("rahul is "+ obj1.Rahul);
     System.out.println("Sachin is "+ obj1.sachin);
     System.out.println("program ended");
          
	}
		
	public void sum()
	{
	
	int a=10;
	int b=12;
	int c=a+b;
	System.out.println("Total is "+ c);	

}
}