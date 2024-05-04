
public class Demo {

	public static void main(String[] args) {
		String s1="Rama";
		String s2="Sita";
		String s3=s1+s2;
		String s4=s1+s2;
		
		if(s3==s4) {
			System.out.println("Referances are equal");
		}
		else {
			System.out.println("References are UnEqual");
		}
		
		if(s3.equals(s4)) {
			System.out.println("Strings are Equal");
		}
		else {
			System.out.println("Strings are Unequal");
		}
	}

}
