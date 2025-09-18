package String;

public class PalidromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="MADAM";
		
	    String rev="";
	    
	    String org_str=s;
		
		for(int i=s.length()-1;i>=0;i--)
		{
			
			rev=rev+s.charAt(i);
			
			
		}
		
		if(org_str.equals(rev))
		{
		System.out.println("String is Palidrom:"+org_str);
	
		}	
		else
		{
			System.out.println("String is not Palidrom:"+org_str);
			
		}
	}

}
