import java.util.*;
public class StringPalindromeApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a String");
		String s1=scan.nextLine();
		
		
		StringPalindrome pal=new StringPalindrome();
		boolean res=pal.isPalindrome(s1);
		
		if(res==true) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not Palindrome");
		}
		

	}

}
