package Method;

public class Greeting {

	//1) No parameters and no return value
	
	void m1()
	{
		System.out.println("Hello");
	}
	
	
	//2) No Parameter and return value
	
	String m2()
	{
		return("Welcome return value");
	}
	
	
	//3) Takes parameter and no return value
	
	void m3(String name)
	{
		System.out.println("Hello"+name);
	}
	
	
	//4) Takes parameter and return value
	
	String m4(String name)
	{
		return("Hello"+name);
	}
}
