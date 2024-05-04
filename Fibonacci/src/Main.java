import java.util.*;
public class Main {
	public static void fibonacci(int n)
	{
		int n1=0;
		int n2=1;
	
		if(n==1) {
			System.out.println(n1);
		}
		else if(n==2) {
			System.out.print(n1+" "+n2);
		}
		else {
			System.out.print(n1+" "+n2+" ");
			for(int i=3;i<=n;i++) {
				int n3=n1+n2;
				System.out.print(n3+" ");
				n1=n2;
				n2=n3;
			}
			
		}
		}
		public static void main(String []args) {
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter the value of n");
			int n=scan.nextInt();
			fibonacci(n);
		}
	}

