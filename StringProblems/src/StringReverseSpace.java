import java.util.*;
public class StringReverseSpace {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a String");
		String s1=scan.nextLine();
		
		Main main=new Main();
		System.out.println(main.reverseString(s1));

	}

}
