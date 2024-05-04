public class Fibonacci{
	public int fibonacci(int n) {
		int n1=0;
		int n2=1;
		if(n==0) {
			System.out.print(n1+" ");
		}
		else if(n==1) {
			System.out.print(n1+" "+n2);
		}
		else {
			System.out.println(n1+" "+n2+" ");
			
			for(int i=3;i<=n;i++) {
				int fib=n1+n2;
				System.out.print(fib+" ");
			
			n1=n2;
			n2=fib;
			}
		}
		return n;
	}
}