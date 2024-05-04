import java.util.*;
public class RevString {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the String");
		String s1=scan.nextLine();
		
		char arr[]=s1.toCharArray();
		System.out.println("the Elements of array are");
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i]);
		}
		

	}

}
