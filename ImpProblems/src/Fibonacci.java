import java.util.*;
public class Fibonacci
{
	public static void main(String []args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the value of n to print it's Fibonacci series");
		int n=scan.nextInt();
		int n1=0,n2=1;
		System.out.print(n1+" "+n2 );
		for(int i=2;i<=n;++i)
		{
			int n3=n1+n2;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
			scan.close();
		}
	}
}