import java.util.*;
public class PrimeNumber{
public static void main(String []args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter a number");
	int n =scan.nextInt();
	int c=0;
	for(int i=2;i<=n/2;i++) {
		if(n%i==0) {
			c=c++;
			break;
		}
	}
	if(c==1) {
		System.out.println("n is not a prime number");
	}
	else {
		System.out.println("n is prime number");
	}
	scan.close();
}
}