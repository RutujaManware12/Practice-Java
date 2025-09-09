package Swaping_number;

public class Swapwith3variable {
   public static void main(String[]args)
   {
	   
	  int a=10,b=20;
	  
	  System.out.println("Before swapping values are.."+a+"   "+b);
	   
	   
	  //Logic 1 - third variable
	  /*
	  int t=a;
	  a=b;
	  b=t;
	  */
	  
	  //Logic 2 - without third variable use 
	  /*
	  a=a+b; //30
	  b=a-b; //30-20=10
	  a=a-b; //30-10=20
		*/
	  
	  //Logic 3 - * and / operator use
	  a=a*b;
	  b=a/b;
	  a=a/b;
	  
	  
	  
	  
	  System.out.println("After swapping values are.."+a+"   "+b);
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
   }

}
