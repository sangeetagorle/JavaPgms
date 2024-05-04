import java.util.*;
public class TwodArray {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number of games and players");
		float [][]arr=new float[scan.nextInt()][scan.nextInt()];
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr[i].length-1;j++) 
			{
				System.out.println("Enter the Height of game " +i+ " and player " +j);
				arr[i][j]=scan.nextFloat();
			}
		}
		System.out.println("Array contents are");
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr[i].length-1;j++) 
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
       scan.close();
	}

}
