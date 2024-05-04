import java.util.*;
public class Demo5 {

	public static void main(String[] args) {
		String s1=new String("Raja Ram Mohan Roy");
		s1=s1.replace('R', 'A');
		System.out.println("replace Method---->"+s1);
		System.out.println("------------------------------");
		s1=s1.replaceAll("Aaja","Raja");
		System.out.println("replaceAll method---->"+s1);
		System.out.println("------------------------------");
	
		/*StringBuffer s1=new StringBuffer("Rama");
		System.out.println(s1.reverse());*/
		String s2=new String("Raman");
		s2=s2.intern();//send the copy of string crested outside the heap to inside the heap
		System.out.println(s2);
		String s3="Raman";
		if(s2==s3) {
			System.out.println("References are equal");
		}
		else {
			System.out.println("References are unequal");
		}
		char arr[]=s2.toCharArray();
		int i=0;
		do {
			System.out.print(arr[i]+"|");
			i++;
		}while(i<=arr.length-1);
		
		System.out.println();
	
          }

}
