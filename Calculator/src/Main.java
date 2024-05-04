
public class Main {
	
	public static void divOfTwo(int n) {
		System.out.println("The numbers Divisible by 2 are");
		for(int i=1;i<=100;i++) {
			if(i%2==0) {
				System.out.print(i+" ");
			}
			}
		System.out.println();
	}
	public static void divOfThree(int n) {
		System.out.println("The numbers Divisible by 3 are");
		for(int i=1;i<=100;i++) {
			if(i%3==0) {
				System.out.print(i+" ");
			}
}
		System.out.println();
	}
	public static void divOfFive(int n) {
		System.out.println("The numbers Divisible by 5 are");
		for(int i=1;i<=100;i++) {
			if(i%5==0) {
				System.out.print(i+" ");
			}
}
		System.out.println();
	}
	public static void divOfTwoandFive(int n) {
		System.out.println("The numbers Divisible by 2 and 5 are");
		for(int i=1;i<=n;i++) {
			if(i%2==0 && i%5==0) {
				System.out.print(i+" ");
			}
		}
		System.out.println();
	}
	public static void divOfThreeandFive(int n) {
		System.out.println("The numbers divisible by 3 and 5 are");
		for(int i=1;i<=n;i++) {
			if(i%3==0 && i%5==0) {
				System.out.print(i +" ");
			}
		}
		System.out.println();
	}
	public static void EvenandDivisible3(int n) {
		System.out.println("The even numbers divisible by 3 are");
		for(int i=1;i<=n;i++) {
			if(i%2==0 && i%3==0) {
				System.out.print(i+" ");
			}
		}
		System.out.println();
	}
	public static void EvenandDivisible5(int n) {
		System.out.println("The even nubers divisible by 5 are");
		for(int i=1;i<=n;i++) {
			if(i%2==0 && i%5==0) {
				System.out.print(i+" ");
			}
		}
		System.out.println();
	}
	
		}
	



