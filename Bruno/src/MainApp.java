import java.util.*;
public class MainApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a Starting range to check whether it is prime or not");
		int s=scan.nextInt();
		System.out.println("Enter a end range to check whether it is prime or not");
		int e=scan.nextInt();
		
		Main main=new Main();
		for(int i=s;i<e;i++) {
		boolean res=main.isPrime(i);
		
		if(res==true) {
			System.out.println(i);
		}
		}
	}

}
