import java.util.*;
public class Demo2 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the s1 ");
		String s1=scan.nextLine();
		System.out.println("Enter the s2 ");
		String s2=scan.nextLine();
		if(s1.compareTo(s2)>0) {
			System.out.println("s1 is greater than s2");
		}
		else if(s1.compareTo(s2)<0) {
			System.out.println("s2 is greater than s1");
		}
		else {
			System.out.println("s1 and s2 are equal");
		}
		

	}

}
