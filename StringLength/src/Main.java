import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a String");
		String str=scan.next();
		char arr[]=str.toCharArray();
		int count=0;
		for(int x:arr) {
			count++;
		}
		System.out.println(count);
		System.out.println("Enter a array length ");
		int arr1[]=new int[scan.nextInt()];
		System.out.println("Enter the elements of array");
		for(int i=0;i<=arr1.length-1;i++) {
			arr1[i]=scan.nextInt();
		}
		int count1=0;
		for(int y:arr1) {
			count1++;
		}
		System.out.println("The length of array is"+count1);
		// TODO Auto-generated method stub

	}

}
