import java.util.Scanner;


public class EvenandGreater {
	public static void main(String arg[]){
		int i;
		 System.out.print("Enter the value");
		 Scanner input=new Scanner(System.in);
		 i=input.nextInt();
		 if(i%2==0)
			 System.out.println("The given number is even");
		 else
			 System.out.println("The given number is odd");
		 
		 int a,b,c;
		 System.out.print("Enter the First value");
		 a=input.nextInt();
		 System.out.print("Enter the Seccond value");
		 b=input.nextInt();
		 System.out.print("Enter the Third value");
		 c=input.nextInt();
		 if(a>b&&a>c){
			 System.out.println("The first value is greatest"+a);
		 }
		 else if(b>a&&b>c){
			 System.out.println("The Second value is greatest"+b);
		 }
		 else
			 System.out.println("The Third value is greatest"+c); 
		 }
		 
		 
			 
	}
	
	
	

