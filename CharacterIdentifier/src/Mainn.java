import java.util.Scanner;

public class Mainn

{

public static void identifyCharacter(char ch)
{
	if(Character.isDigit(ch)) {
		System.out.println("Digit");
	}else if(!Character.isLetter(ch))
	{
		System.out.println("Special Character");
	}
	else {
		switch(Character.toLowerCase(ch)) {
		case'a':
		case'e':
		case'i':
		case'o':
		case'u':
			if(Character.isLowerCase(ch))
			{
				System.out.println("Lower Case Vowel");
			}else {
				System.out.println("UpperCase Vowel");
				
			}
			break;
		default:
			if(Character.isLowerCase(ch)) {
				System.out.println("LowerCase Consonants");
			}
			else {
				System.out.println("Uppercase Consonants");
			}
		}
	}

}

public static void main(String[] args)
{
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the Character");
	char ch=scan.next().charAt(0);
	identifyCharacter(ch);
	}

}