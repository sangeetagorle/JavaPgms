import java.util.*;
public class GCDApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the 2 numbers to find the GCD");
		int m=scan.nextInt();
		int n=scan.nextInt();
		
		
		int res=GCD.findGCD(m,n);
		System.out.println(res);
		
	}

}
