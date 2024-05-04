import java.util.*;
public class FactorApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=scan.nextInt();
		
		
		factors(n);
		System.out.println(n);

	}


	int factors(int n) {
		for(int i=1;i<n;i++) {
			if(n%i==0) {
				System.out.println(i);
			}
		}
		return n;
	}

}


