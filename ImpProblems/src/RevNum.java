import java.util.*;
public class RevNum {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a Number");
		int n=scan.nextInt();
		int sum=0,r;
		while(n>0) {
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
		}
		System.out.println(sum);
		scan.close();
	}

}
