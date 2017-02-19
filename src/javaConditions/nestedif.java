package javaConditions;

public class nestedif {

	public static void main(String[] args) {
		
		int runs=600 ;
		
		if (runs>450)
		{
			System.out.println("We will win since we scored "+runs) ;
		}
		
		else if (runs<200)
		{
			System.out.println("We will  lose since we scored "+runs) ;
		}
	  
		else if (runs>300)
		{
			System.out.println("there is a possibility to win , but might be too close "+runs) ;
		}
	  
		else 
		{
			System.out.println("We migth lose since we scored "+runs) ;
		}
	  

	}

}