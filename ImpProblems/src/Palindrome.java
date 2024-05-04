import java.util.*;
public class Palindrome {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter palindrome number");
		int n=scan.nextInt();
		int temp,sum=0,r;
		temp=n;
		while(n>0)
		{
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
			
		}
		if(temp==sum) {
			System.out.println("number is palindrome");
		}
		else {
			System.out.println("number is not palindrome");
		}
		scan.close();

	}

}
