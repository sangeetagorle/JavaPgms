import java.util.Scanner;

public class BinaryDecimals {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n=scan.nextInt();
		int rem;
		String bin="";
		int sum=0;

		while(n>0) {
			rem=n%2;
			bin=rem+bin;
			n=n/2;
			
		}
		System.out.println(bin);
		
		
		// TODO Auto-generated method stub

	}

}
