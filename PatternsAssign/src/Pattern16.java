public class Pattern16{
	public static void main(String[] args) {
		
		for(int i=1;i<=5;i++) {
			int n=1;
			for(int j=i;j<=5;j++) {
				System.out.print(n);
				n++;
			}
			System.out.println();
			
		}
		for(int i=2;i<=5;i++) {
			
			for(int j=1;j<=i;j++) {
				System.out.print(j);
				
			}
			System.out.println();
	}
}
}