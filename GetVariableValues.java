import java.util.Scanner;


public class GetVariableValues {
	public static void main(String args[]){
		System.out.println("Getting All Datatype Values");
		
		int i;
		float j;
		double pi;
		String s;
		Scanner input=new Scanner(System.in);
		i=input.nextInt();
		j=input.nextFloat();
		pi=input.nextDouble();
		s=input.next();
		
		
		System.out.println("Integer Value="+i);
		System.out.println("Float value="+j);
		System.out.println("Double Value="+pi);
		System.out.println("String value="+s);

}
}
