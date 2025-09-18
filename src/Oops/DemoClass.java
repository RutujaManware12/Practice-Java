package Oops;

public class DemoClass {

	int eid;
	String name;
	String job;
	int sal;
	
	//method
	
	void display()
	{
		System.out.println(eid);
		System.out.println(name);
		System.out.println(job);
		System.out.println(sal);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DemoClass emp1=new DemoClass();
		emp1.eid=101;
		emp1.name="komal";
		emp1.job="Manager";
		emp1.sal=3534;
		emp1.display();
		
		
		
	}

}
