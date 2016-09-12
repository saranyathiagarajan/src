import java.util.Scanner;


public class ExampleForandWhile {
	public static void main(String args[]){
		System.out.println("Example for For loop");
		System.out.println("How many times you want to print?");
		int n,i=0;
		Scanner input=new Scanner(System.in);
		n=input.nextInt();
		System.out.println("Enter the string:");
		String s=input.next();
		for(i=0;i<=n;i++)
		{
			System.out.println("Input String=="+s);
		}
		System.out.println("Example for while loop");
		
		System.out.println("Enter the string for while loop:");
		String str=input.next();
		int k=10;
		while( k<15){
			
			System.out.println("Given String=="+str);
			k++;
			 System.out.print("\n");
		}
	

}
}
