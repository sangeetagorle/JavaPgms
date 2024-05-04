import java.util.*;
public class HarshadApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Number ");
		int num=scan.nextInt();
		
		Harshad hn=new Harshad();
		boolean res=hn.isHarshad(num);
		
		if(res==true) {
			System.out.println("harshad number");
		}
		else {
			System.out.println("Not Harshad Number");
		}
		

	}

}
