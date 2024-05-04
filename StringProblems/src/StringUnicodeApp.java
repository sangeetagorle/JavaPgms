import java.util.*;
public class StringUnicodeApp {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a String");
		String s1=scan.nextLine();
		
		StringUnicode stringunicode=new StringUnicode();
		stringunicode.printUnicode(s1);
		
		
	}

}
