import java.util.*;
public class StringLengthApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the two Strings");
		String s1=scan.nextLine();
		String s2=scan.nextLine();
		System.out.println(s1.length());
		System.out.println(s2.length());
		
		StringLength stringlength=new StringLength();
		boolean res=stringlength.lengthChecker(s1,s2);
		
		if(res==true) {
			System.out.println("Both Strings are of same length");
				}
		else {
			System.out.println("Both the Strings are of differnt length");
		}
		
		
		

	}

}
