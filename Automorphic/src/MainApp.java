import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number ");
		int num=scan.nextInt();
		
		Main automorphic=new Main();
		boolean res=automorphic.isAutomorphic(num);
		
		if(res==true) {
			System.out.println("Automorphic");
		}
		else {
			System.out.println("Not Automorphic");
		}
	}

}
