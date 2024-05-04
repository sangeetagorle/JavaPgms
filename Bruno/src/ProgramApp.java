import java.util.*;
public class ProgramApp{
	public static void main(String []args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the n value");
		int n=scan.nextInt();
		int count=0;
		
		for(int i=2;i<=n/2;i++) {
			if(n%2==0) {
				count++;
				break;
			}
		}
	}
}