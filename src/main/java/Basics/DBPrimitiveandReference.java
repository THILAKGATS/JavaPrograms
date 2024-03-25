package Basics;

import java.util.Arrays;

public class DBPrimitiveandReference {

	public static void main(String[] args) 
	{
		/* Difference between 
		 * Primitive and Reference Data Types*/
		  System.out.println("Primitive Data Type");
		  int x = 20;
		  int y=x;
		  System.out.println("Initially ");
		  System.out.println("X = "+ x + " , Y = "+y);
		  /*Here is the value of y is changed
		   * but the value of x is not changed */
		  y =30;
		  System.out.println("**Only value of y is affected here "
		            + "because of Primitive Data Type**");
		  System.out.println("X = "+ x + " , Y = "+y);
		  
		  System.out.println("Reference Data types");
		   int c []= {10,20,30,40,50,60};
		   int d[]= c;
		   System.out.println("Initially");
		  System.out.println("Arrays of c: "+ Arrays.toString(c));
		  System.out.println("Arrays of d: "+ Arrays.toString(d));
		  
		  // After changing the value to d it affects the value of C
		  d[5]= 70;
		  System.out.println("After modification");
		  System.out.println("Arrays of c: "+ Arrays.toString(c));
		  System.out.println("Arrays of d: "+ Arrays.toString(d));
		  
		  
		
		
		
	}

}
