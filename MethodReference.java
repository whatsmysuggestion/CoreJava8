interface Demo
{
	void display();
}


public class MethodReference {

	public static void put()
	{
		System.out.println("Hello Welcome");
	}
	
	public static void main(String[] args) {
		
		Demo d=MethodReference::put;
		d.display();
		
	}
	
}
