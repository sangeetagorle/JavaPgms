import java.util.*;
public class Main
{
	public static void identifyCharacter(char ch)
	{
		if(Character.isLowerCase(ch)) {
			if(isVowel(ch)) {
				System.out.println("lower case vowel");
			}
			else {
				System.out.println("lowercase consonant");
			}
		}else if(Character.isUpperCase(ch)) {
			if(isVowel(ch)) {
				System.out.println("UpperCase Vowel");
			}
			else {
				System.out.println("UpperCase Consonant");
			}
		}else if(Character.isDigit(ch)) {
			System.out.println("Digit");
		}else {
			System.out.println("Special Symbol");
		}

}
	public static boolean isVowel(char ch) {
		ch=Character.toLowerCase(ch);
		boolean res=ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u';
		return res; 
		
		
	}

public static void main(String[] args)
{
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the Character");
	char ch=scan.next().charAt(0);
	identifyCharacter(ch);

}

}