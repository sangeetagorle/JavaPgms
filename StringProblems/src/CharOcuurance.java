import java.util.*;
public class CharOcuurance{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number of class");
		int m=scan.nextInt();
		int arr[][]=new int[m][];
		
		for(int i=0;i<=arr.length-1;i++) {
			System.out.println("Enter the students in each class");
			arr[i]=new int[scan.nextInt()];
		}
		
		
		for(int i=0;i<=arr.length-1;i++) {
			for(int j=0;j<=arr[i].length-1;j++) {
				System.out.println("Enter the elements into "+i+"of"+j+" class");
				arr[i][j]=scan.nextInt();
			}
		}
		System.out.println("The Students are");
		for(int i=0;i<=arr.length-1;i++) {
			for(int j=0;j<arr[i].length-1;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}