import java.util.Scanner;


public class CountExample {
	
	public static void main(String arg[]){
	int i,count=0;
	int a[]={1,2,3,4,5,6,7,8,9,10};
	System.out.println("Enter the value");
	 Scanner input=new Scanner(System.in);
	 i=input.nextInt();
	 System.out.print("Array of Elements:"); 
	 for(count=0;count<a.length;count++){
		 if(i!=a[count])
			 System.out.print(" "+a[count]); 
	 }
		
	 }
	 
	 
	 
	 /*for(count=0;count<a.length;count++){
	
	if(a[count]==i)
	{
		break;
	}
	 
	 }
	 System.out.print("Array of Elements:"+a[count]);
	 }*/
	 
	 //System.out.print(+a[j]);
	 
}
