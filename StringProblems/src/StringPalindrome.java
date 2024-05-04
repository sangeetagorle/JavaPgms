public class StringPalindrome{
	boolean isPalindrome(String s1) {
		char arr[]=s1.toCharArray();
		char arr2[]=new char[arr.length];
		System.out.println("String before reversing===>"+s1);
		
		int j=arr2.length-1;
		for(int i=0;i<=arr.length-1;i++) {
			arr2[j]=arr[i];
			j--;
		}
		String s2=new String(arr2);
		System.out.println("String after reversing===>"+s2);
		if(s1.equalsIgnoreCase(s2)) {
		return true;
		}
		else {
			return false;
		}
	}
}