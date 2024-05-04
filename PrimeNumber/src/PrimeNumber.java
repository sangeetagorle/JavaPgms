import java.util.*;
public class PrimeNumber {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the value of N");
		int n=scan.nextInt();
		
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				System.out.println("Entered number is not prime");
				return;
			}
			}
		System.out.println("prime number");
		}
	}

	


