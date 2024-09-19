package testpm.test_12;

public class test12_bonus {

	public static void main(String[] args) {
		int[] a = new int[5000];
		int sum = 0;
		for(int n=1; n<5000; n++) {
			if(n/1000+((n%1000)/100)+((n%100)/10)+n%10+n<5000) {
				a[n/1000+((n%1000)/100)+((n%100)/10)+n%10+n]++;
			}
		}
		System.out.println(a[20]);
		for(int i=1; i<5000; i++) {
			if(a[i]==0) {
				sum+=i;
			}
		}
		System.out.println(sum);
	}

}
