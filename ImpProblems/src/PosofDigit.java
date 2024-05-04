import java.util.*;
public class PosofDigit {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Number");
		int n=scan.nextInt();
		System.out.println("Enter the position ");		
		int position=scan.nextInt();
		
		for(int i=1;i<position;i++) {
			
			n=n/10;
			
		}
		int rem=n%10;
		System.out.println(rem);

	}

}
 