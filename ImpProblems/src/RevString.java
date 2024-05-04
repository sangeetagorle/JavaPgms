import java.util.*;
public class RevString {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter String");
		String rev="";
		String a=scan.nextLine();
		
		char ch[]=a.toCharArray();
		for(int i=ch.length-1;i>=0;i--) {
			rev=rev+ch[i];
		}
        System.out.println(rev);
	}

}
