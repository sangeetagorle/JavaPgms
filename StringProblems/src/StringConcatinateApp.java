import java.util.*;
public class StringConcatinateApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a two strings");
		String s1=scan.nextLine();
		String s2=scan.nextLine();
		
		StringConcatinate stringconcat=new StringConcatinate();
		boolean res=stringconcat.lengthChecker(s1,s2);
		
		if(res==true) {
			System.out.println(s1.concat(s2));
		}
		else {
			System.out.println("Both Strings are of different values");
		}

	}

}
