import java.util.*;
public class ULCountApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a String");
		String s1=scan.nextLine();
		
		ULCount count=new ULCount();
		count.upperLowerCount(s1);
	}

}
