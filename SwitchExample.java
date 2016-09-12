import java.util.Scanner;


public class SwitchExample {
	public static void main(String arg[]){
		int value;
		char a;
		 System.out.print("Enter the value");
		 Scanner input=new Scanner(System.in);
		 value= input.nextInt();
		 
		 switch(value)
		 {
			 case 1:
				System.out.print("Android");
		 		break;
		 case 2:
			System.out.print("Java");
		 	break;
		 case 3:
			System.out.print("DotNet");
		 	break;
		 default:
		 	System.out.print("Value Mismatch");
		 	break;
		 
				 
		 }
	}

}
