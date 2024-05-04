import java.util.*;
public class MainApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n=scan.nextInt();
		
		Main.divOfTwo(n);
		Main.divOfThree(n);
		Main.divOfFive(n);
		Main.divOfTwoandFive(n);
		Main.divOfThreeandFive(n);
		Main.EvenandDivisible3(n); 
		Main.EvenandDivisible5(n);
		
		

	}

}
