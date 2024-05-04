import java.util.*;
public class StringsDemo {

	public static void main(String[] args) {
		/*Scanner scan=new Scanner(System.in);
		System.out.println("Enter a length of array");
		char [] arr1=new char[scan.nextInt()];
		System.out.println("Enter the elements of array");
		for(int i=0;i<=arr1.length-1;i++) {
			arr1[i]=scan.next().charAt(0);
		}
		System.out.println("The elements of array1 are");
		for(char x:arr1) {
			System.out.print(x+"|");
		}
		System.out.println();
	
		System.out.println("arr2 contents");
		char[] arr2=new char[arr1.length];
		for(int i=0;i<=arr2.length-1;i++)
		{
			arr2[i]=arr1[i];
			}
		for(char x:arr2) {
			System.out.print(x+"|");
		}
		System.out.println();
		
		System.out.println("arr3 contents");
		char[] arr3=new char[arr1.length];
		for(int i=0;i<=arr1.length-1;i++)
		{
			arr3[i]=arr1[i];
			}
		for(int i=arr3.length-1;i>=0;i--) {
			System.out.print(arr3[i]+"|");
		}
		System.out.println();*/
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the Length of array");
		char arr[]=new char[scan.nextInt()];
		
		System.out.println("Enter the elements of array");
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=scan.next().charAt(0);
		}
		System.out.println("The Array elements are");
		for(char x:arr) {
			System.out.print(x+"|");
		}
		System.out.println();
		
		char arr2[]=new char[arr.length];
		for(int i=0;i<=arr.length-1;i++) {
			arr2[i]=arr[i];
		}
		System.out.println("The elements of array2 are");
		for(char x:arr2) {
			System.out.print(x+"|");
		}
		System.out.println();
		
		char arr3[]=new char[arr2.length];
		for(int i=0;i<=arr3.length-1;i++) {
			arr3[i]=arr2[i];
		}
		System.out.println("Elements of array 3 are");
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(arr2[i]+"|");
			
		}
		System.out.println();
	
	}

}
