import java.util.*;
class TwoodArray{
	public static void main(String []args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the 1st D of array");
		int n=scan.nextInt();
		int arr[][]=new int[n][];
		
		for(int i=0;i<=arr.length-1;i++) {
		System.out.println("enter the 2nd D of array");
		int m=scan.nextInt();
		arr[i]=new int[m];
		}
		for (int i=0;i<=arr.length-1;i++) {
			for(int j=0;j<=arr[i].length-1;j++) {
				System.out.println("Enter the Score of game "+i+ " and player " +j );
				arr[i][j]=scan.nextInt();
			}
		}
		System.out.println("Array contents are.....");
		for(int i=0;i<=arr.length-1;i++) {
			for(int j=0;j<=arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
				
			}
			System.out.println();
		}
		scan.close();
	}
}