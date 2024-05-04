

public class Program1 {
	public int power(int n,int count ) {
		int res=(int)Math.pow(n, count);
		return res;
	}
	
	public int armStrong(int n,int count) {
		Program1 armstrong=new Program1();
		int sum=0;
		while(n!=0) {
			int rem=n%10;
			int res=Program1.power(rem,count);
			sum=sum+res;
			n=n/10;
			
		}
		return 0;
		
	}
}
