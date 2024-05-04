import java.util.*;
public class AmicableApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter two Numbers");
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		
		Amicable friendlyPair=new Amicable();
		int sum1=friendlyPair.isAmicable(num1);
		int sum2=friendlyPair.isAmicable(num2);
		
		int res1=sum1/num1;
		int res2=sum2/num2;
		
		if(res1==res2) {
			System.out.println("The numbers are Friendly Pair or Amicable");
		}
		else {
			System.out.println("The numbers are not friendly pair or Amicable");
		}
	}

}
