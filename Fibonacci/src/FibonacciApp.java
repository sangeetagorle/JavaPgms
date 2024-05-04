import java.util.*;
public class FibonacciApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Range to Find Fibonacci nubers");
		int n=scan.nextInt();
		
		Fibonacci fib=new Fibonacci();
		int res=fib.fibonacci(n);
		
		
	}

}
