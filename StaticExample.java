import java.util.Scanner;



public class StaticExample {
	int k=0;float c;
	
	public int get(){
		System.out.print("Enter the value");
		 Scanner input=new Scanner(System.in);
		int  i=input.nextInt();
		int j=input.nextInt();
	
		k=i+j;
		return k;
		
	}
	public void display()
	{
	System.out.println("Example for sum and product");	
	System.out.println("Product="+c);
	}
	public float mul(int a ,int b)
	{
	
	c=a*b;
	return c;
	
	}
	public void show()
	{
		System.out.println(" sum="+k);
		
	}
	public static void main(String args[]){
		StaticExample obj=new StaticExample();
		obj.mul(20, 30);
		obj.display();
		obj.get();
	
		obj.show();
		
		
		
		
	}

}
