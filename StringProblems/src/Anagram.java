import java.util.*;
public class Anagram {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter two Strings");
		String s1=scan.nextLine();
		String s2=scan.nextLine();
		
		boolean res=isAnagram(s1,s2);
		if(res==true) {
			System.out.println("anagram");
		}
		else {
			System.out.println("Not Anagram");
		}
		
	}
		public static boolean isAnagram(String s1,String s2) {
			s1=s1.toLowerCase();
			s2=s2.toLowerCase();

			
			char str1[]=s1.toCharArray();
			char str2[]=s2.toCharArray();
			
			Arrays.sort(str1);
			Arrays.sort(str2);
			
			for(int i=0;i<=str1.length-1;i++){
				if(str1[i]==str2[i]) {
					return true;
				}
				else {
					continue;
				}	
		}
			return false;
	}
		}
