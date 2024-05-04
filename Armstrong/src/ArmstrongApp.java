import java.util.*;
public class ArmstrongApp{
	public static void main(String []args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the value of N");
		int num=scan.nextInt();
		int original=num;
		int count=0;
		
		while(num!=0) {
			num=num/10;
			count++;
		}
		Armstrong armstrong=new Armstrong();
		int res=armstrong.sumOfDigits(original,count);
		if(res==original) {
			System.out.println("Armstrong");
		}
		else {
			System.out.println("Not Armstrong");
		}
		
	}
}