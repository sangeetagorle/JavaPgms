import java.util.Scanner;
public class LeapYearApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a year");
		int year=scan.nextInt();
		
		LeapYear leap=new LeapYear();
		int res=leap.leapYear(year);
		
		if(res>0) {
			System.out.println("Leap Year");
		}
		else {
			System.out.println("Not leap Year");
		}
	}

}

