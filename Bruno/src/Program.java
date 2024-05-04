import java.util.*;
public class Program{
	public static void main(String []args) {
		Scanner scan=new Scanner (System.in);
		System.out.println("Enter the Size of 1d");
		int n=scan.nextInt();
		int [][] arr=new int[n][];
		
		System.out.println("enter the length of 2d");
		for(int i=0;i<=arr.length-1;i++) {
			int m=scan.nextInt();
			arr[i]=new int[m];
		}
		System.out.println("Enter the Elements of Array");
		for(int i=0;i<=arr.length-1;i++) {
			for(int j=0;j<=arr[i].length-1;j++) {
				arr[i][j]=scan.nextInt();
			}}
	System.out.println("The elements of Array");
	for(int i=0;i<=arr.length-1;i++) {
		for(int j=0;j<=arr[i].length-1;j++) {
			System.out.print(arr[i][j]+" ");
		
	}
		System.out.println();
		}
	}
	
}