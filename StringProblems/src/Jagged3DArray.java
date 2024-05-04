import java.util.*;
public class Jagged3DArray {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number of schools");
		int m=scan.nextInt();
		int arr[][][]=new int[m][][];
		
		for(int i=0;i<=arr.length-1;i++) {
			System.out.println("Enter the number of classes");
			arr[i]=new int[scan.nextInt()][];
			for(int j=0;j<=arr[i].length-1;j++) {
				System.out.println("Enter the number students of classes in school");
				arr[i][j]=new int[scan.nextInt()];
			}
		}
		for(int i=0;i<=arr.length-1;i++) {
			for(int j=0;j<=arr[i].length-1;j++) {
				for(int k=0;k<=arr[i][j].length-1;k++) {
					System.out.println("Enter the marks of student "+k+ "in class"+j+" in school"+i);
					arr[i][j][k]=scan.nextInt();
				}
			}
		}
		System.out.println("The marks of students in school are");
		for(int i=0;i<=arr.length-1;i++) {
			for(int j=0;j<=arr[i].length-1;j++) {
				for(int k=0;k<=arr[i][j].length-1;k++) {
					System.out.print(arr[i][j][k]+" ");
				}
				System.out.println();
			}
			System.out.println("========================================");
		}
		
				}
	}


