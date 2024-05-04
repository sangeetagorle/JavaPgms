import java.util.*;
public class FindGCDApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int m=scan.nextInt();
		
		FindGCD findgcd=new FindGCD();
		int res=findgcd.gcd(m, n);
		System.out.println(res);
		// TODO Auto-generated method stub

	}

}
