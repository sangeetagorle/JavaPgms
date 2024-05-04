import java.util.*;
public class JaggedArray {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the 1st D of Array");
		int n=scan.nextInt();
		String arr[][]=new String[n][];	
		
		for(int i=0;i<=arr.length-1;i++) {
			System.out.println("Enter the 2nd D of Array");
			int m=scan.nextInt();
			arr[i]=new String[m];
			scan.nextLine();
		}
		for(int i=0;i<=arr.length-1;i++) {
			for(int j=0;j<=arr[i].length-1;j++) {
				System.out.println("Enter the bank "+i+ " and names "+j);
				arr[i][j]=scan.nextLine();
				
			}
		}
	
		System.out.println("Array Contents ar.....");
		for(int i=0;i<=arr.length-1;i++) {
			for(int j=0;j<=arr[i].length-1;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		
			}
		

	}

}
