import java.util.*;
public class DecimalBinary {
	public static void main(String [] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=scan.nextInt();
		int num=n;
		int rem;
		String binary="";
		while(n>0) {
			rem=n%2;
			binary=rem+binary;
			n=n/2;
			
		}
		System.out.println("Binary number of "+num+ " is "+binary);
	}

}
