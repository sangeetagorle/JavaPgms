
public class Demo3 {

	public static void main(String[] args) {
		
		
		/*StringBuffer s1=new StringBuffer("Rama");
		System.out.println(s1);
		s1.append("Sita");
		System.out.println(s1);
		
		StringBuilder s2=new StringBuilder("Ravana");
		System.out.println(s2);
		s2.append("Asura");
		System.out.println(s2);*/
		
		 StringBuffer s1=new StringBuffer();
		 System.out.println(s1.capacity());
		 s1.append("Sachin is a Batsman");
		 System.out.println(s1.capacity());
		 s1.append("He lives in Mubai");
		 System.out.println(s1.capacity());
		 
		 StringBuilder s2=new StringBuilder();
		 System.out.println(s2.capacity());
		 s2.append("Saura is a Batsman");
		 System.out.println(s2.capacity());
		 s2.append("He lives in Mubai");
		 System.out.println(s2.capacity());
	}

}
