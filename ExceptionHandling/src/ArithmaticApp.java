import java.util.Scanner;

public class ArithmaticApp {

	public static void main(String[] args) {
		System.out.println("Welcome to Arithmetic Application");
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the value of a");
		int a=scan.nextInt();
		System.out.println("Enter the value of b");
		int b=scan.nextInt();
		addition(a,b);
		// TODO Auto-generated method stub

	}
	private static void addition(int a,int b) {
		int sum=a+b;
		System.out.println("Addition result "+sum);
		subtraction(a,b);
		
	}
	private static void subtraction(int a,int b) {
		int sub=0;
		try {
			 sub=a-b;
			 System.out.println("Subtraction result "+sub);
		}catch (ArithmeticException e) {
			System.out.println("Arithmatic Exception Handled : a should be greater then b");
		}
		
	}

}
