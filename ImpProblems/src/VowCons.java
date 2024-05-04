import java.util.*;
public class VowCons {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a Word");
		String str=scan.nextLine();
		str=str.toLowerCase();
		char ch[]=str.toCharArray();
		int vowel=0,cons=0;
		
		for(int i=0;i<ch.length;i++) {
			if(ch[i]=='a'|| ch[i]=='e'|| ch[i]=='i' ||ch[i]=='0' ||ch[i]=='u') {
				vowel=vowel+1;
			}
			else {
				cons=cons+1;
			}
		}
		System.out.println("the number of Vowels are "+vowel+ " and number of Consonants are "+cons);
		
	}

}
