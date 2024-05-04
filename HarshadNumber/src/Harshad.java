
public class Harshad {
	public boolean isHarshad(int num) {
		int original=num;
		int sum=0;
		int rem=0;
		while(num!=0) {
			rem=num%10;
			sum=sum+rem;
			num=num/10;
		}
		if(original%sum==0) {
			return true;
			
		}else {
		return false;
		}}

}
