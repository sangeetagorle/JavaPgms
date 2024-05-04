import java.util.*;
public class Swapping {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the value of A and B");
	int a= scan.nextInt();
	int b=scan.nextInt();
	
	int c= a+b;
	a=c-a;
	b=c-b;
	
	System.out.println("a="+a);
	System.out.println("b="+b);
	
	}

}
