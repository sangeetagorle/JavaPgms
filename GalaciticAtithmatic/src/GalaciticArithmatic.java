import java.util.*;
public class GalaciticArithmatic {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter two numbers");
		long num1=scan.nextLong();
		long num2=scan.nextLong();
		long res=galaciticArithmatic(num1,num2);
		System.out.println(res);

	}
public static long galaciticArithmatic(long num1,long num2) 
{
	return num1+num2;
	
}
}
