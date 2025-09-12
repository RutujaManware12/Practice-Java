package Array;

public class TwoDimentional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// Approach 1
		
		/*
		int a[][]=new int[3][2];
		
		a[0][0]=100;
		a[0][1]=200;
		a[1][0]=300;
		a[1][1]=400;
		a[2][0]=500;
		a[2][1]=600;
		*/
		
		
		// Approch 2
		int a[][]= {{100,200},{300,400},{500,600}};
		System.out.println(a[1][1]);
		
		
		//Find the size of array
		
		System.out.println("Length of row is:"+a.length);
		System.out.println("Length of coloum is:"+a[0].length);
		
		
		// Read single value of array
	      System.out.println(a[2][1]);
		
		
		
		
		// Read all value of array
		
	      /*
	    for(int r=0;r<3;r++)
		{
			for(int c=0;c<2;c++)
			{
			System.out.println(a[r][c]);
			}
		}
		*/
	      
	      //Using Enhance for loop
	      
	      
	   
		
		
		
		
		
		
		
		
		
		
		
	}

}
