package testpm_06;

public class testcode {

	public static void main(String[] args) {
		int max=0;
		int sum=0;
		int[] letter={8,12,4,13,25,14,4,5,48};
		for(int i=0; i<letter.length; i++) {
			if(letter[i]%2==0) {
				sum+=i;
			}
			else {
				i+=0;
			}
			if(sum>max) {
				max+=i;
			}
		}
		System.out.println(max);
	}

}
