
public class NonstaticExample {
	public  static void disp()
	{
		System.out.println("Welcome to Payilagam");
	}
	public void show()
	{
		System.out.println("Hello Everyone");
	}
	public static void main(String arg[])
	{
		NonstaticExample obj=new NonstaticExample();
		disp();
		obj.show();
	}
	

}
