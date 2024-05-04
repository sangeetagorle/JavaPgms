import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter aString");
		String original=scan.nextLine();
		String rev=" ";
		
		char ch[]=original.toCharArray();
		for(int i=ch.length-1;i>=0;i--) {
		rev=rev+ch[i];
		
		}
		System.out.println(rev);
	}

}
