import java.util.*;
public class Employee {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number of people");
		int n=scan.nextInt();
		boolean arr[]=new boolean[n];
		System.out.println("Is a person Married");
		
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=scan.nextBoolean();
		}
		System.out.println("Array Contents are");
		for(int i=0;i<=arr.length-1;i++) 
		{
			System.out.println(arr[i]);
		}
		
		
	}

}
