import java.util.*;
public class CharOcuurance{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter two String to check Anagram");
		String s1=scan.next();
		String s2=scan.next();
		
		if(s1.length()==s2.length()) {
			checkAnagram(s1,s2);
		}
	}
		public static void checkAnagram(String s1,String s2) {
			String s3=s1.toLowerCase();
			String s4=s2.toLowerCase();
			
			char ch1[]=s3.toCharArray();
			char ch2[]=s4.toCharArray();
			
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			
			if(ch1==ch2) {
				System.out.println("Word is Anagram");
			}
			else {
				System.out.println("Word is not Anagram");
			}
		}
	
	
	
}
