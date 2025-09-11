package Array;

public class SingleDimentiona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// declaring array
		
		//1) approach
		
		/*
		int a[]=new int[5];
		
		a[0]=100;
		a[1]=200;
		a[2]=300;
		a[3]=400;
		a[4]=500;
		*/
		
		//2) Approch 2
		
		int a[]= {100,200,300,400,500,6996,56,646,56456,566,45,6,545,6};
		
		// finf length of the arrray
		
		//System.out.println("Length of the array:"+a.length);
		
		
		
		
		
		// 3) using for loop fetch all value of array
		/*
		for(int i=0;i<=a.length-1;i++)
		{
			System.out.println(a[i]);
		}
		
		*/
		
		//Using Enhance for loop 
		
		for(int x:a)
		{
			System.out.println (x);
		}
		
		

	}

}
