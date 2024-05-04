import java.util.*;
public class Lcm {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the value to find lcm of two numbers");
		int n1=scan.nextInt();
		int n2=scan.nextInt();
		
		int lcm=(n1>n2)?n1:n2;
		while(true) {
			if(lcm%n1==0 && lcm%n2==0) {
				System.out.println(lcm);
				break;
			}
			lcm++;
			
		}

	}

}
