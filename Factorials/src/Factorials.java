import java.util.*;
public class Factorials {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n=scan.nextInt();
		
		System.out.println("FActorials of N numbers is "+factorial(n));
		
	}
		
	static	int factorial(int n) {
		int fact=1;
		
		for(int i=1;i<=n;i++) {
			fact=fact*i;
		
		}
		return fact;
	
	

}
}
