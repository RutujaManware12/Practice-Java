package Array;

public class Searchingelemen {

	public static void main(String[] args) {
		 
		int a[]= {100,34,56,223,45,32,32,55,2};
		int search_element=3489;
		
		boolean status=false;
		
		for(int i=0;i<a.length;i++)
		{
			
			if(a[i]==search_element)
			{
				System.out.println("Element found");
				status=true;
				break;
				
			}
				
		}
		
		if(status==false)
		{
		System.out.println("Element is not found");
		}
		
	
	}

}
