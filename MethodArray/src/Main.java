import java.util.Arrays;
class Main{
public static void main(String[] args)
{
//String Arr[] = { "xy","ab" };
//System.out.println("Integer Array as List: " + Arrays.asList(Arr));
	
	/*int intArr[] = { 10, 20, 15, 22, 35 };
	Arrays.sort(intArr);
	int intKey = 22;
	System.out.println(intKey + " found at index = "+ Arrays.binarySearch(intArr, intKey));*/
	
	/*int intArr[] = { 10, 20, 15, 22, 35 };
	int intArr1[] = {10,20, 15,22,35};
	System.out.println("Integer Arrays on comparison: "+ Arrays.compare(intArr, intArr1));*/
	
	/*int intArr[] = { 10, 20, 15, 22, 35 };
	int intArr1[] = { 10, 15, 22 };


	System.out.println("Integer Arrays on comparison: "+ Arrays.equals(intArr, intArr1));*/
	
	int intArr[] = { 10, 20, 15, 22, 35 };
	Arrays.sort(intArr);
	System.out.println("Integer Array: "+ Arrays.toString(intArr));
}
}
