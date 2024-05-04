import java.util.*;
public class PrimeNumber {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a range to find prime number");
		int n=scan.nextInt();
		int c=0;
		
		for(int i=2;i<n/2;i++) {
			if(n%i==0) {
				c++;
				break;
			}
		}
			if(c==1) {
				System.out.println("not prime");
			}
			else {
				System.out.println("prime");
			}
		

	}

}
