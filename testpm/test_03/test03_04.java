package testpm.test_03;

public class test03_04 {

	public static void main(String[] args) {
		System.out.println("문제5");
		/* int[] lotto = {6, 12, 33, 4, 5, 26}; (배열의 값은 바뀔 수 있다.)
		 * 홀수인 로또 번호의 합을 구하시오.. 결과 : 33 + 5 = 38
		 */
		int[] lotto3 = {6, 12, 33, 4, 5, 26};
		int oddSum = 0;
		if (lotto3[0]%2==1) {
			oddSum += lotto3[0];
		}
		if (lotto3[1]%2==1) {
			oddSum += lotto3[1];
		}
		if (lotto3[2]%2==1) {
			oddSum += lotto3[2];
		}
		if (lotto3[3]%2==1) {
			oddSum += lotto3[3];
		}
		if (lotto3[4]%2==1) {
			oddSum += lotto3[4];
		}
		if (lotto3[5]%2==1) {
			oddSum += lotto3[5];
		}
		System.out.println(oddSum);
		
	}

}
