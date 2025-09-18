package String;

public class RemoveJunk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s="@$#Hel%$#%lo!@#335";
		
		s=s.replaceAll("[^a-zA-Z]"," ");
		
		System.out.println(s);
	}

}
