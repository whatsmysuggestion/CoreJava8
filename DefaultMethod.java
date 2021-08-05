interface A
{
	
	static void disp()
	{
		System.out.println("Static Method");
	}
	default void saySomething()
	{
		System.out.println("Saying Something");
	}
}
public class DefaultMethod implements A
{
	public static void main(String[] args) {
		
		DefaultMethod df=new DefaultMethod();
		df.saySomething();
		
		
		A.disp();
	}

}
