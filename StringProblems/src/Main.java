
public class Main {
	String reverseString(String s1) {
		char arr[]=s1.toCharArray();
		char revarr[]=new char[arr.length];
		
		for(int i=0;i<=arr.length-1;i++) {
			if(arr[i]==' ') {
				revarr[i]=arr[i];
			}
		}
		int j=revarr.length-1;
		for(int i=0;i<=arr.length-1;i++) {
			if(arr[i]!=' ') 
			{	
			if(revarr[j]==' ') {
				j--;
			}
		
			revarr[j]=arr[i];
			j--;
			
			}
		}
		s1=new String(revarr);
		return s1;
	}

}
