import java.util.*;
public class Program1App {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number to check whether armstrong or not ");
		int num=scan.nextInt();
		int original=num;
		int count=0;
		while(num!=0) {
			num=num/10;
			count++;
		}
		Program1 arm=new Program1();
		int res=arm.armstrong(original,count);

	}

}
