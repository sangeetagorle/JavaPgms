import java.util.*;
public class MainApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Value of N");
		int n=scan.nextInt();
		Main main=new Main();
		int res=main.reverseDigit(n);
		System.out.println("Reverse of number is "+ res);
		if(n==res) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not Plaindrome");
		}
	
		}

}
