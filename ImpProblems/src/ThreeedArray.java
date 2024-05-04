import java.util.*;
public class ThreeedArray {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the 1D array length");
		int n=scan.nextInt();
		int arr[][][]=new int[n][][];
		
		System.out.println("Enter the 2nd Dimension for 1D ");
		for(int i=0;i<=arr.length-1;i++) {
			System.out.println("Enter the 2nd Dimension for 1D "+i);
			int m=scan.nextInt();
			arr[i]=new int[m][];
		}
		
		System.out.println("Enter the 3nd Dimension for 1D ");
		for(int i=0;i<=arr.length-1;i++) {
			for(int j=0;j<arr[i].length-1;j++) {
			System.out.println("Enter the 2nd Dimension for 1D "+i+ " 2D "+j);
			int p=scan.nextInt();
			arr[i][j]=new int[p];
			}
			}	
		
		for(int i=0;i<=arr.length-1;i++) {
			for(int j=0;j<arr[i].length-1;j++) {
				for(int k=0;k<=arr[i][j].length-1;k++) {
					System.out.println("Enter the marks of school "+i+ " class "+j+ " student "+k);
					arr[i][j][k]=scan.nextInt();
				}
			}
		}
		System.out.println("Array contents are......");
		for(int i=0;i<=arr.length-1;i++) {
			for(int j=0;j<arr[i].length-1;j++) {
				for(int k=0;k<=arr[i][j].length-1;k++) {
					System.out.print(arr[i][j][k]+" ");
				}
				System.out.println();
			}
			System.out.println("--------------");
			}
		

	}

}
