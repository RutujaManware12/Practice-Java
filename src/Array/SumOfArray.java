package Array;

public class SumOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int a[]= {3,5,1,3,18,9};
		
		int sum=0;
		
		for(int i=0;i<=a.length-1;i++)
		{
			sum=sum+a[i];
		}

		System.out.println("Sum of the number is:"+sum);
	}

}
