
public class ULCount {
	void upperLowerCount(String s1) {
		int ucount=0;
		int lcount=0;
		for(int i=0;i<=s1.length()-1;i++) {
			
			if(Character.isLowerCase(s1.charAt(i))) {
				lcount++;
			}
			else {
				ucount++;
			}
		}
		System.out.println("lowercase"+lcount);
		System.out.println("lowercase"+ucount);
	}

}
