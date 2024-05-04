import java.util.Scanner;

public class PalindromeStringArray {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the length of array");
		String arr[]=new String[scan.nextInt()];
		
		System.out.println("Enter the elements into array");
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=scan.next();
		}
		System.out.println("The array elements are");
		for(int i=0;i<=arr.length-1;i++) {
			System.out.println(arr[i]);
		}
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i].equals(arr[j])) {
					System.out.println("duplicate element"+arr[i]);
				}
			}
		}
		// TODO Auto-generated method stub

	}

}
