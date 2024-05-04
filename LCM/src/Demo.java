import java.util.Scanner;

public class Demo{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the range for finding fibonacci series");
		int m=scan.nextInt();
		int n=scan.nextInt();
				int res=findLCM(m,n);
				System.out.println(res);
			
		}
	public static int findGCD(int m,int n){
		while(n!=0) {
			int rem=m%n;
			m=n;
			n=rem;
			
		}
		int gcd=m;
		return gcd;
		
	}
	public static int findLCM(int m,int n) {
		int mul=m*n;
	
		int lcm=mul/findGCD(m,n);
				
		return lcm;
	}
}