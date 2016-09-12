
public class Add {
	public int i=10;
	int j,k;
	int c=0;
	public void disp()
	{
		System.out.println("welcome");
	}
	public Add(  int a,  int b){
		
		c=a+b;
		
	
		}
	public void show()
	{
		System.out.println("sum="+c);
		System.out.println("value assigned to global variable"+j);

	}
	public Add() {
		// TODO Auto-generated constructor stub
		System.out.println("Default Constructor");

		
	}
	public Add(int g)
	{
		j=g;
		
	}
	public static void main( String args[]) {
		
		Add obj = new Add();
		
			
		obj.disp();
		System.out.println("Adding two numbers");
		Add obj2 = new Add(10,10);
		obj2.show();
		Add obj1= new Add(5);
		obj1.show();
		
	}

}
